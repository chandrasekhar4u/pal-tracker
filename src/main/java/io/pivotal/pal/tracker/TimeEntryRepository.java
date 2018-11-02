package io.pivotal.pal.tracker;

import java.util.List;

public interface TimeEntryRepository {
    public TimeEntry create(TimeEntry timeEntry);
    public TimeEntry find(Long id);

    TimeEntry update(Long id, TimeEntry timeEntry);

    List<TimeEntry> list();

    void delete(Long id);
}
