/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/OrganizationCustomRuleMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationCustomRuleMetadata implements Serializable, Cloneable, StructuredPojo {

    private String description;

    private String lambdaFunctionArn;

    private com.amazonaws.internal.SdkInternalList<String> organizationConfigRuleTriggerTypes;

    private String inputParameters;

    private String maximumExecutionFrequency;

    private com.amazonaws.internal.SdkInternalList<String> resourceTypesScope;

    private String resourceIdScope;

    private String tagKeyScope;

    private String tagValueScope;

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomRuleMetadata withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param lambdaFunctionArn
     */

    public void setLambdaFunctionArn(String lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
    }

    /**
     * @return
     */

    public String getLambdaFunctionArn() {
        return this.lambdaFunctionArn;
    }

    /**
     * @param lambdaFunctionArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomRuleMetadata withLambdaFunctionArn(String lambdaFunctionArn) {
        setLambdaFunctionArn(lambdaFunctionArn);
        return this;
    }

    /**
     * @return
     * @see OrganizationConfigRuleTriggerType
     */

    public java.util.List<String> getOrganizationConfigRuleTriggerTypes() {
        if (organizationConfigRuleTriggerTypes == null) {
            organizationConfigRuleTriggerTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return organizationConfigRuleTriggerTypes;
    }

    /**
     * @param organizationConfigRuleTriggerTypes
     * @see OrganizationConfigRuleTriggerType
     */

    public void setOrganizationConfigRuleTriggerTypes(java.util.Collection<String> organizationConfigRuleTriggerTypes) {
        if (organizationConfigRuleTriggerTypes == null) {
            this.organizationConfigRuleTriggerTypes = null;
            return;
        }

        this.organizationConfigRuleTriggerTypes = new com.amazonaws.internal.SdkInternalList<String>(organizationConfigRuleTriggerTypes);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationConfigRuleTriggerTypes(java.util.Collection)} or
     * {@link #withOrganizationConfigRuleTriggerTypes(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param organizationConfigRuleTriggerTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationConfigRuleTriggerType
     */

    public OrganizationCustomRuleMetadata withOrganizationConfigRuleTriggerTypes(String... organizationConfigRuleTriggerTypes) {
        if (this.organizationConfigRuleTriggerTypes == null) {
            setOrganizationConfigRuleTriggerTypes(new com.amazonaws.internal.SdkInternalList<String>(organizationConfigRuleTriggerTypes.length));
        }
        for (String ele : organizationConfigRuleTriggerTypes) {
            this.organizationConfigRuleTriggerTypes.add(ele);
        }
        return this;
    }

    /**
     * @param organizationConfigRuleTriggerTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationConfigRuleTriggerType
     */

    public OrganizationCustomRuleMetadata withOrganizationConfigRuleTriggerTypes(java.util.Collection<String> organizationConfigRuleTriggerTypes) {
        setOrganizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes);
        return this;
    }

    /**
     * @param organizationConfigRuleTriggerTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationConfigRuleTriggerType
     */

    public OrganizationCustomRuleMetadata withOrganizationConfigRuleTriggerTypes(OrganizationConfigRuleTriggerType... organizationConfigRuleTriggerTypes) {
        com.amazonaws.internal.SdkInternalList<String> organizationConfigRuleTriggerTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                organizationConfigRuleTriggerTypes.length);
        for (OrganizationConfigRuleTriggerType value : organizationConfigRuleTriggerTypes) {
            organizationConfigRuleTriggerTypesCopy.add(value.toString());
        }
        if (getOrganizationConfigRuleTriggerTypes() == null) {
            setOrganizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypesCopy);
        } else {
            getOrganizationConfigRuleTriggerTypes().addAll(organizationConfigRuleTriggerTypesCopy);
        }
        return this;
    }

    /**
     * @param inputParameters
     */

    public void setInputParameters(String inputParameters) {
        this.inputParameters = inputParameters;
    }

    /**
     * @return
     */

    public String getInputParameters() {
        return this.inputParameters;
    }

    /**
     * @param inputParameters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomRuleMetadata withInputParameters(String inputParameters) {
        setInputParameters(inputParameters);
        return this;
    }

    /**
     * @param maximumExecutionFrequency
     * @see MaximumExecutionFrequency
     */

    public void setMaximumExecutionFrequency(String maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
    }

    /**
     * @return
     * @see MaximumExecutionFrequency
     */

    public String getMaximumExecutionFrequency() {
        return this.maximumExecutionFrequency;
    }

    /**
     * @param maximumExecutionFrequency
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumExecutionFrequency
     */

    public OrganizationCustomRuleMetadata withMaximumExecutionFrequency(String maximumExecutionFrequency) {
        setMaximumExecutionFrequency(maximumExecutionFrequency);
        return this;
    }

    /**
     * @param maximumExecutionFrequency
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaximumExecutionFrequency
     */

    public OrganizationCustomRuleMetadata withMaximumExecutionFrequency(MaximumExecutionFrequency maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getResourceTypesScope() {
        if (resourceTypesScope == null) {
            resourceTypesScope = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypesScope;
    }

    /**
     * @param resourceTypesScope
     */

    public void setResourceTypesScope(java.util.Collection<String> resourceTypesScope) {
        if (resourceTypesScope == null) {
            this.resourceTypesScope = null;
            return;
        }

        this.resourceTypesScope = new com.amazonaws.internal.SdkInternalList<String>(resourceTypesScope);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypesScope(java.util.Collection)} or {@link #withResourceTypesScope(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourceTypesScope
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomRuleMetadata withResourceTypesScope(String... resourceTypesScope) {
        if (this.resourceTypesScope == null) {
            setResourceTypesScope(new com.amazonaws.internal.SdkInternalList<String>(resourceTypesScope.length));
        }
        for (String ele : resourceTypesScope) {
            this.resourceTypesScope.add(ele);
        }
        return this;
    }

    /**
     * @param resourceTypesScope
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomRuleMetadata withResourceTypesScope(java.util.Collection<String> resourceTypesScope) {
        setResourceTypesScope(resourceTypesScope);
        return this;
    }

    /**
     * @param resourceIdScope
     */

    public void setResourceIdScope(String resourceIdScope) {
        this.resourceIdScope = resourceIdScope;
    }

    /**
     * @return
     */

    public String getResourceIdScope() {
        return this.resourceIdScope;
    }

    /**
     * @param resourceIdScope
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomRuleMetadata withResourceIdScope(String resourceIdScope) {
        setResourceIdScope(resourceIdScope);
        return this;
    }

    /**
     * @param tagKeyScope
     */

    public void setTagKeyScope(String tagKeyScope) {
        this.tagKeyScope = tagKeyScope;
    }

    /**
     * @return
     */

    public String getTagKeyScope() {
        return this.tagKeyScope;
    }

    /**
     * @param tagKeyScope
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomRuleMetadata withTagKeyScope(String tagKeyScope) {
        setTagKeyScope(tagKeyScope);
        return this;
    }

    /**
     * @param tagValueScope
     */

    public void setTagValueScope(String tagValueScope) {
        this.tagValueScope = tagValueScope;
    }

    /**
     * @return
     */

    public String getTagValueScope() {
        return this.tagValueScope;
    }

    /**
     * @param tagValueScope
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationCustomRuleMetadata withTagValueScope(String tagValueScope) {
        setTagValueScope(tagValueScope);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLambdaFunctionArn() != null)
            sb.append("LambdaFunctionArn: ").append(getLambdaFunctionArn()).append(",");
        if (getOrganizationConfigRuleTriggerTypes() != null)
            sb.append("OrganizationConfigRuleTriggerTypes: ").append(getOrganizationConfigRuleTriggerTypes()).append(",");
        if (getInputParameters() != null)
            sb.append("InputParameters: ").append(getInputParameters()).append(",");
        if (getMaximumExecutionFrequency() != null)
            sb.append("MaximumExecutionFrequency: ").append(getMaximumExecutionFrequency()).append(",");
        if (getResourceTypesScope() != null)
            sb.append("ResourceTypesScope: ").append(getResourceTypesScope()).append(",");
        if (getResourceIdScope() != null)
            sb.append("ResourceIdScope: ").append(getResourceIdScope()).append(",");
        if (getTagKeyScope() != null)
            sb.append("TagKeyScope: ").append(getTagKeyScope()).append(",");
        if (getTagValueScope() != null)
            sb.append("TagValueScope: ").append(getTagValueScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationCustomRuleMetadata == false)
            return false;
        OrganizationCustomRuleMetadata other = (OrganizationCustomRuleMetadata) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLambdaFunctionArn() == null ^ this.getLambdaFunctionArn() == null)
            return false;
        if (other.getLambdaFunctionArn() != null && other.getLambdaFunctionArn().equals(this.getLambdaFunctionArn()) == false)
            return false;
        if (other.getOrganizationConfigRuleTriggerTypes() == null ^ this.getOrganizationConfigRuleTriggerTypes() == null)
            return false;
        if (other.getOrganizationConfigRuleTriggerTypes() != null
                && other.getOrganizationConfigRuleTriggerTypes().equals(this.getOrganizationConfigRuleTriggerTypes()) == false)
            return false;
        if (other.getInputParameters() == null ^ this.getInputParameters() == null)
            return false;
        if (other.getInputParameters() != null && other.getInputParameters().equals(this.getInputParameters()) == false)
            return false;
        if (other.getMaximumExecutionFrequency() == null ^ this.getMaximumExecutionFrequency() == null)
            return false;
        if (other.getMaximumExecutionFrequency() != null && other.getMaximumExecutionFrequency().equals(this.getMaximumExecutionFrequency()) == false)
            return false;
        if (other.getResourceTypesScope() == null ^ this.getResourceTypesScope() == null)
            return false;
        if (other.getResourceTypesScope() != null && other.getResourceTypesScope().equals(this.getResourceTypesScope()) == false)
            return false;
        if (other.getResourceIdScope() == null ^ this.getResourceIdScope() == null)
            return false;
        if (other.getResourceIdScope() != null && other.getResourceIdScope().equals(this.getResourceIdScope()) == false)
            return false;
        if (other.getTagKeyScope() == null ^ this.getTagKeyScope() == null)
            return false;
        if (other.getTagKeyScope() != null && other.getTagKeyScope().equals(this.getTagKeyScope()) == false)
            return false;
        if (other.getTagValueScope() == null ^ this.getTagValueScope() == null)
            return false;
        if (other.getTagValueScope() != null && other.getTagValueScope().equals(this.getTagValueScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionArn() == null) ? 0 : getLambdaFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getOrganizationConfigRuleTriggerTypes() == null) ? 0 : getOrganizationConfigRuleTriggerTypes().hashCode());
        hashCode = prime * hashCode + ((getInputParameters() == null) ? 0 : getInputParameters().hashCode());
        hashCode = prime * hashCode + ((getMaximumExecutionFrequency() == null) ? 0 : getMaximumExecutionFrequency().hashCode());
        hashCode = prime * hashCode + ((getResourceTypesScope() == null) ? 0 : getResourceTypesScope().hashCode());
        hashCode = prime * hashCode + ((getResourceIdScope() == null) ? 0 : getResourceIdScope().hashCode());
        hashCode = prime * hashCode + ((getTagKeyScope() == null) ? 0 : getTagKeyScope().hashCode());
        hashCode = prime * hashCode + ((getTagValueScope() == null) ? 0 : getTagValueScope().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationCustomRuleMetadata clone() {
        try {
            return (OrganizationCustomRuleMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.OrganizationCustomRuleMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
