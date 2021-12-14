package one.jkr.de.jkrsoftware.entity.locking.libraries.dynamoDb.locking.library.locking.system.application.service;

import lombok.NonNull;
import one.jkr.de.jkrsoftware.entity.locking.libraries.dynamoDb.locking.library.locking.system.adapters.out.persistence.DynamoDBLockPersistor;
import one.jkr.de.jkrsoftware.entity.locking.libraries.dynamoDb.locking.library.locking.system.adapters.out.persistence.DynamoDBLockRequestPersistor;
import one.jkr.de.jkrsoftware.entity.locking.libraries.dynamoDb.locking.library.locking.system.application.service.ports.in.get.current.entity.lock.CurrentLockUseCaseForDynamoDB;
import one.jkr.de.jkrsoftware.entity.locking.libraries.dynamoDb.locking.library.locking.system.application.service.ports.in.lock.LockUseCaseForDynamoDB;
import one.jkr.de.jkrsoftware.entity.locking.libraries.dynamoDb.locking.library.locking.system.application.service.ports.in.unlock.UnlockUseCaseForDynamoDB;
import one.jkr.de.jkrsoftware.entity.locking.libraries.generic.locking.library.locking.system.application.service.LockingService;

import java.time.Clock;

public class DynamoDBLockingService
        extends LockingService
        implements CurrentLockUseCaseForDynamoDB, LockUseCaseForDynamoDB, UnlockUseCaseForDynamoDB {

    public DynamoDBLockingService(@NonNull Clock clock, long pollingRateOnLockRequestQueue) {
        super(
                new DynamoDBLockPersistor(clock),
                new DynamoDBLockRequestPersistor(pollingRateOnLockRequestQueue, clock)
        );
    }

}
