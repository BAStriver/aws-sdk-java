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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateTransitGatewayConnectPeer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateTransitGatewayConnectPeerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway Connect peer.
     * </p>
     */
    private String transitGatewayConnectPeerArn;

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @return The ID of the global network.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateTransitGatewayConnectPeerRequest withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway Connect peer.
     * </p>
     * 
     * @param transitGatewayConnectPeerArn
     *        The Amazon Resource Name (ARN) of the transit gateway Connect peer.
     */

    public void setTransitGatewayConnectPeerArn(String transitGatewayConnectPeerArn) {
        this.transitGatewayConnectPeerArn = transitGatewayConnectPeerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway Connect peer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the transit gateway Connect peer.
     */

    public String getTransitGatewayConnectPeerArn() {
        return this.transitGatewayConnectPeerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway Connect peer.
     * </p>
     * 
     * @param transitGatewayConnectPeerArn
     *        The Amazon Resource Name (ARN) of the transit gateway Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateTransitGatewayConnectPeerRequest withTransitGatewayConnectPeerArn(String transitGatewayConnectPeerArn) {
        setTransitGatewayConnectPeerArn(transitGatewayConnectPeerArn);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getTransitGatewayConnectPeerArn() != null)
            sb.append("TransitGatewayConnectPeerArn: ").append(getTransitGatewayConnectPeerArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateTransitGatewayConnectPeerRequest == false)
            return false;
        DisassociateTransitGatewayConnectPeerRequest other = (DisassociateTransitGatewayConnectPeerRequest) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getTransitGatewayConnectPeerArn() == null ^ this.getTransitGatewayConnectPeerArn() == null)
            return false;
        if (other.getTransitGatewayConnectPeerArn() != null && other.getTransitGatewayConnectPeerArn().equals(this.getTransitGatewayConnectPeerArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayConnectPeerArn() == null) ? 0 : getTransitGatewayConnectPeerArn().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateTransitGatewayConnectPeerRequest clone() {
        return (DisassociateTransitGatewayConnectPeerRequest) super.clone();
    }

}
