package com.onesignal.repository;

import com.onesignal.model.OneSignalPushNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hiemseyha on 6/13/18.
 */



@Repository
public interface OneSignalPushNotificationRepository extends
        JpaRepository<OneSignalPushNotification, Long> {
}
