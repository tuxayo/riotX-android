/*
 * Copyright 2019 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.vector.matrix.android.api.session.room.model.message

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import im.vector.matrix.android.api.session.events.model.Content
import im.vector.matrix.android.api.session.room.model.relation.RelationDefaultContent

@JsonClass(generateAdapter = true)
data class MessageLocationContent(
        /**
         * Required. Must be 'm.location'.
         */
        @Json(name = "msgtype") override val msgType: String,

        /**
         * Required. A description of the location e.g. 'Big Ben, London, UK', or some kind of content description for accessibility e.g. 'location attachment'.
         */
        @Json(name = "body") override val body: String,

        /**
         * Required. A geo URI representing this location.
         */
        @Json(name = "geo_uri") val geoUri: String,

        /**
         *
         */
        @Json(name = "info") val locationInfo: LocationInfo? = null,

        @Json(name = "m.relates_to") override val relatesTo: RelationDefaultContent? = null,
        @Json(name = "m.new_content") override val newContent: Content? = null
) : MessageContent
