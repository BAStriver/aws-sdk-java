/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the response information for the
 * <code>CreateTrafficPolicyInstance</code> request.
 * </p>
 */
public class CreateTrafficPolicyInstanceResult implements Serializable, Cloneable {

    /**
     * A complex type that contains settings for the new traffic policy
     * instance.
     */
    private TrafficPolicyInstance trafficPolicyInstance;

    /**
     * A unique URL that represents a new traffic policy instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String location;

    /**
     * A complex type that contains settings for the new traffic policy
     * instance.
     *
     * @return A complex type that contains settings for the new traffic policy
     *         instance.
     */
    public TrafficPolicyInstance getTrafficPolicyInstance() {
        return trafficPolicyInstance;
    }
    
    /**
     * A complex type that contains settings for the new traffic policy
     * instance.
     *
     * @param trafficPolicyInstance A complex type that contains settings for the new traffic policy
     *         instance.
     */
    public void setTrafficPolicyInstance(TrafficPolicyInstance trafficPolicyInstance) {
        this.trafficPolicyInstance = trafficPolicyInstance;
    }
    
    /**
     * A complex type that contains settings for the new traffic policy
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trafficPolicyInstance A complex type that contains settings for the new traffic policy
     *         instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTrafficPolicyInstanceResult withTrafficPolicyInstance(TrafficPolicyInstance trafficPolicyInstance) {
        this.trafficPolicyInstance = trafficPolicyInstance;
        return this;
    }

    /**
     * A unique URL that represents a new traffic policy instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return A unique URL that represents a new traffic policy instance.
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * A unique URL that represents a new traffic policy instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param location A unique URL that represents a new traffic policy instance.
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * A unique URL that represents a new traffic policy instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param location A unique URL that represents a new traffic policy instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTrafficPolicyInstanceResult withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTrafficPolicyInstance() != null) sb.append("TrafficPolicyInstance: " + getTrafficPolicyInstance() + ",");
        if (getLocation() != null) sb.append("Location: " + getLocation() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTrafficPolicyInstance() == null) ? 0 : getTrafficPolicyInstance().hashCode()); 
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateTrafficPolicyInstanceResult == false) return false;
        CreateTrafficPolicyInstanceResult other = (CreateTrafficPolicyInstanceResult)obj;
        
        if (other.getTrafficPolicyInstance() == null ^ this.getTrafficPolicyInstance() == null) return false;
        if (other.getTrafficPolicyInstance() != null && other.getTrafficPolicyInstance().equals(this.getTrafficPolicyInstance()) == false) return false; 
        if (other.getLocation() == null ^ this.getLocation() == null) return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateTrafficPolicyInstanceResult clone() {
        try {
            return (CreateTrafficPolicyInstanceResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    