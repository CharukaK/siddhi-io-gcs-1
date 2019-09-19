package io.siddhi.extension.io.gcs.sink.internal.content;


import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/**
 * Content Aggregator for Binary event mappers
 */
public class BinaryContentAggregator implements ContentAggregator, Serializable {
    private int eventCount;
    private String contentDelimiter;
    private String contentString;

    public BinaryContentAggregator(String contentDelimiter) {
        this.contentDelimiter = contentDelimiter;
    }

    @Override
    public void addEvent(Object payload) {
        if (eventCount == 0) {
            contentString = new String(((ByteBuffer) payload).array(), StandardCharsets.UTF_8);
        } else {
            contentString = contentString.concat(String.format("%n%s%n", contentDelimiter))
                    .concat(new String(((ByteBuffer) payload).array(), StandardCharsets.UTF_8));
        }

        eventCount++;
    }

    @Override
    public String getContentString() {
        return contentString;
    }

    @Override
    public int getQueuedSize() {
        return eventCount;
    }

    public int getEventCount() {
        return eventCount;
    }

    public void setEventCount(int eventCount) {
        this.eventCount = eventCount;
    }

    public String getContentDelimiter() {
        return contentDelimiter;
    }

    public void setContentDelimiter(String contentDelimiter) {
        this.contentDelimiter = contentDelimiter;
    }

    public void setContentString(String contentString) {
        this.contentString = contentString;
    }
}
