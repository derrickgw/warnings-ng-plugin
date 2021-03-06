package io.jenkins.plugins.analysis.core.charts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Chart label showing the build date.
 *
 * @author Ullrich Hafner
 */
class LocalDateLabel implements Comparable<LocalDateLabel> {
    private final LocalDate date;
    private final DateTimeFormatter formatter;

    /**
     * Creates a new instance of {@link LocalDateLabel}.
     *
     * @param date
     *            the date of the build
     */
    LocalDateLabel(final LocalDate date) {
        this.date = date;
        formatter = DateTimeFormatter.ofPattern("MM-dd");
    }

    @Override
    public int compareTo(final LocalDateLabel o) {
        return date.compareTo(o.date);
    }

    @Override
    public String toString() {
        return formatter.format(date);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        LocalDateLabel other = (LocalDateLabel)obj;
        if (date == null) {
            return other.date == null;
        }
        else {
            return date.equals(other.date);
        }
    }
}

