package one.jkr.de.jkrsoftware.entity.locking.libraries.dynamoDb.locking.library.locking.system.adapters.in;

import lombok.NonNull;
import one.jkr.de.jkrsoftware.entity.locking.libraries.dynamoDb.locking.library.locking.system.application.service.DynamoDBLockingService;
import one.jkr.de.jkrsoftware.entity.locking.libraries.generic.locking.library.locking.system.adapter.in.LockingSystemAdapter;

import java.time.Clock;

public class DynamoDBLockingSystemAdapter extends LockingSystemAdapter {

    public DynamoDBLockingSystemAdapter(@NonNull Clock clock, long pollingRateOnLockRequestQueue) {
        super(
                new DynamoDBLockingService(clock, pollingRateOnLockRequestQueue)
        );
    }

}
