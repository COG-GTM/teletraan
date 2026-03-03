/**
 * Copyright (c) 2024 Pinterest, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pinterest.deployservice.common;

import java.time.Instant;

/**
 * A simple time interval class that replaces org.joda.time.Interval. Represents a half-open
 * interval of time from a start instant (inclusive) to an end instant (exclusive), stored as
 * milliseconds since the epoch.
 */
public class TimeInterval {

    private final long startMillis;
    private final long endMillis;

    /**
     * Creates a new TimeInterval from start and end milliseconds since epoch.
     *
     * @param startMillis the start of the interval in milliseconds since epoch (inclusive)
     * @param endMillis the end of the interval in milliseconds since epoch (exclusive)
     */
    public TimeInterval(long startMillis, long endMillis) {
        this.startMillis = startMillis;
        this.endMillis = endMillis;
    }

    /**
     * Creates a new TimeInterval from two Instant values.
     *
     * @param start the start of the interval (inclusive)
     * @param end the end of the interval (exclusive)
     */
    public TimeInterval(Instant start, Instant end) {
        this.startMillis = start.toEpochMilli();
        this.endMillis = end.toEpochMilli();
    }

    /** Returns the start of the interval in milliseconds since epoch. */
    public long getStartMillis() {
        return startMillis;
    }

    /** Returns the end of the interval in milliseconds since epoch. */
    public long getEndMillis() {
        return endMillis;
    }

    /** Returns the start of the interval as an Instant. */
    public Instant getStart() {
        return Instant.ofEpochMilli(startMillis);
    }

    /** Returns the end of the interval as an Instant. */
    public Instant getEnd() {
        return Instant.ofEpochMilli(endMillis);
    }

    @Override
    public String toString() {
        return String.format("TimeInterval[%s, %s)", getStart(), getEnd());
    }
}
