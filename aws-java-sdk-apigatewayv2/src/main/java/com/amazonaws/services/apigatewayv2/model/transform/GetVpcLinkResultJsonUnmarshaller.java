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
package com.amazonaws.services.apigatewayv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigatewayv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetVpcLinkResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVpcLinkResultJsonUnmarshaller implements Unmarshaller<GetVpcLinkResult, JsonUnmarshallerContext> {

    public GetVpcLinkResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetVpcLinkResult getVpcLinkResult = new GetVpcLinkResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getVpcLinkResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("createdDate", targetDepth)) {
                    context.nextToken();
                    getVpcLinkResult.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getVpcLinkResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("securityGroupIds", targetDepth)) {
                    context.nextToken();
                    getVpcLinkResult.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("subnetIds", targetDepth)) {
                    context.nextToken();
                    getVpcLinkResult.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getVpcLinkResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("vpcLinkId", targetDepth)) {
                    context.nextToken();
                    getVpcLinkResult.setVpcLinkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcLinkStatus", targetDepth)) {
                    context.nextToken();
                    getVpcLinkResult.setVpcLinkStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcLinkStatusMessage", targetDepth)) {
                    context.nextToken();
                    getVpcLinkResult.setVpcLinkStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcLinkVersion", targetDepth)) {
                    context.nextToken();
                    getVpcLinkResult.setVpcLinkVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getVpcLinkResult;
    }

    private static GetVpcLinkResultJsonUnmarshaller instance;

    public static GetVpcLinkResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetVpcLinkResultJsonUnmarshaller();
        return instance;
    }
}
