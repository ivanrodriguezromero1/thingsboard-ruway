/**
 * Copyright © 2016-2024 The Thingsboard Authors
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
package org.thingsboard.server.common.data.notification.targets.platform;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.thingsboard.server.common.data.notification.targets.NotificationTargetConfig;
import org.thingsboard.server.common.data.notification.targets.NotificationTargetType;

@Data
@EqualsAndHashCode(callSuper = true)
public class PlatformUsersNotificationTargetConfig extends NotificationTargetConfig {

    @NotNull
    @Valid
    private UsersFilter usersFilter;

    @Override
    public NotificationTargetType getType() {
        return NotificationTargetType.PLATFORM_USERS;
    }

}