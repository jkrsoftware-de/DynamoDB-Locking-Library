package one.jkr.de.jkrsoftware.entity.locking.libraries.dynamoDb.locking.library.locking.system.application.service;

import one.jkr.de.jkrsoftware.entity.locking.libraries.dynamoDb.locking.library.locking.system.adapters.out.persistence.DynamoDBLockPersistor;
import one.jkr.de.jkrsoftware.entity.locking.libraries.dynamoDb.locking.library.locking.system.adapters.out.persistence.DynamoDBLockRequestPersistor;
import one.jkr.de.jkrsoftware.entity.locking.libraries.dynamoDb.locking.library.locking.system.application.ports.in.get.current.entity.lock.CurrentLockUseCaseForDynamoDB;
import one.jkr.de.jkrsoftware.entity.locking.libraries.dynamoDb.locking.library.locking.system.application.ports.in.lock.LockUseCaseForDynamoDB;
import one.jkr.de.jkrsoftware.entity.locking.libraries.dynamoDb.locking.library.locking.system.application.ports.in.unlock.UnlockUseCaseForDynamoDB;
import one.jkr.de.jkrsoftware.entity.locking.libraries.generic.locking.library.locking.system.application.service.LockingService;

public class DynamoDBLockingService
        extends LockingService
        implements CurrentLockUseCaseForDynamoDB, LockUseCaseForDynamoDB, UnlockUseCaseForDynamoDB {

    public DynamoDBLockingService(long pollingRateOnLockRequestQueue) {
        super(
                new DynamoDBLockPersistor(),
                new DynamoDBLockRequestPersistor(pollingRateOnLockRequestQueue)
        );
    }

}
