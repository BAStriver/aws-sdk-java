/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.health.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.health.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OrganizationEventMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OrganizationEventMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> SERVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("service").build();
    private static final MarshallingInfo<String> EVENTTYPECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventTypeCode").build();
    private static final MarshallingInfo<String> EVENTTYPECATEGORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventTypeCategory").build();
    private static final MarshallingInfo<String> EVENTSCOPECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventScopeCode").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("region").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUSCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusCode").build();

    private static final OrganizationEventMarshaller instance = new OrganizationEventMarshaller();

    public static OrganizationEventMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OrganizationEvent organizationEvent, ProtocolMarshaller protocolMarshaller) {

        if (organizationEvent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(organizationEvent.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(organizationEvent.getService(), SERVICE_BINDING);
            protocolMarshaller.marshall(organizationEvent.getEventTypeCode(), EVENTTYPECODE_BINDING);
            protocolMarshaller.marshall(organizationEvent.getEventTypeCategory(), EVENTTYPECATEGORY_BINDING);
            protocolMarshaller.marshall(organizationEvent.getEventScopeCode(), EVENTSCOPECODE_BINDING);
            protocolMarshaller.marshall(organizationEvent.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(organizationEvent.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(organizationEvent.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(organizationEvent.getLastUpdatedTime(), LASTUPDATEDTIME_BINDING);
            protocolMarshaller.marshall(organizationEvent.getStatusCode(), STATUSCODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
