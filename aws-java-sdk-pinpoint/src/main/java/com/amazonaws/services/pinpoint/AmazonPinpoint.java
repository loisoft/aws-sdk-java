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
package com.amazonaws.services.pinpoint;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.pinpoint.model.*;

/**
 * Interface for accessing Amazon Pinpoint.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pinpoint.AbstractAmazonPinpoint} instead.
 * </p>
 * <p>
 * Amazon Pinpoint
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPinpoint {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "pinpoint";

    /**
     * Overrides the default endpoint for this client ("https://pinpoint.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "pinpoint.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://pinpoint.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "pinpoint.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://pinpoint.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonPinpoint#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Creates an application.
     * </p>
     * 
     * @param createAppRequest
     * @return Result of the CreateApp operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAppResult createApp(CreateAppRequest createAppRequest);

    /**
     * <p>
     * Creates a new campaign for an application or updates the settings of an existing campaign for an application.
     * </p>
     * 
     * @param createCampaignRequest
     * @return Result of the CreateCampaign operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    CreateCampaignResult createCampaign(CreateCampaignRequest createCampaignRequest);

    /**
     * <p>
     * Creates a new export job for an application.
     * </p>
     * 
     * @param createExportJobRequest
     * @return Result of the CreateExportJob operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.CreateExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateExportJob" target="_top">AWS API
     *      Documentation</a>
     */
    CreateExportJobResult createExportJob(CreateExportJobRequest createExportJobRequest);

    /**
     * <p>
     * Creates a new import job for an application.
     * </p>
     * 
     * @param createImportJobRequest
     * @return Result of the CreateImportJob operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.CreateImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    CreateImportJobResult createImportJob(CreateImportJobRequest createImportJobRequest);

    /**
     * <p>
     * Creates a new segment for an application or updates the configuration, dimension, and other settings for an
     * existing segment that's associated with an application.
     * </p>
     * 
     * @param createSegmentRequest
     * @return Result of the CreateSegment operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.CreateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSegmentResult createSegment(CreateSegmentRequest createSegmentRequest);

    /**
     * <p>
     * Disables the ADM channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteAdmChannelRequest
     * @return Result of the DeleteAdmChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAdmChannelResult deleteAdmChannel(DeleteAdmChannelRequest deleteAdmChannelRequest);

    /**
     * <p>
     * Disables the APNs channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsChannelRequest
     * @return Result of the DeleteApnsChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteApnsChannelResult deleteApnsChannel(DeleteApnsChannelRequest deleteApnsChannelRequest);

    /**
     * <p>
     * Disables the APNs sandbox channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsSandboxChannelRequest
     * @return Result of the DeleteApnsSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApnsSandboxChannelResult deleteApnsSandboxChannel(DeleteApnsSandboxChannelRequest deleteApnsSandboxChannelRequest);

    /**
     * <p>
     * Disables the APNs VoIP channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsVoipChannelRequest
     * @return Result of the DeleteApnsVoipChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteApnsVoipChannelResult deleteApnsVoipChannel(DeleteApnsVoipChannelRequest deleteApnsVoipChannelRequest);

    /**
     * <p>
     * Disables the APNs VoIP sandbox channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsVoipSandboxChannelRequest
     * @return Result of the DeleteApnsVoipSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApnsVoipSandboxChannelResult deleteApnsVoipSandboxChannel(DeleteApnsVoipSandboxChannelRequest deleteApnsVoipSandboxChannelRequest);

    /**
     * <p>
     * Deletes an application.
     * </p>
     * 
     * @param deleteAppRequest
     * @return Result of the DeleteApp operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAppResult deleteApp(DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Disables the Baidu channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteBaiduChannelRequest
     * @return Result of the DeleteBaiduChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteBaiduChannel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteBaiduChannelResult deleteBaiduChannel(DeleteBaiduChannelRequest deleteBaiduChannelRequest);

    /**
     * <p>
     * Deletes a campaign from an application.
     * </p>
     * 
     * @param deleteCampaignRequest
     * @return Result of the DeleteCampaign operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteCampaignResult deleteCampaign(DeleteCampaignRequest deleteCampaignRequest);

    /**
     * <p>
     * Disables the email channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteEmailChannelRequest
     * @return Result of the DeleteEmailChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEmailChannel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteEmailChannelResult deleteEmailChannel(DeleteEmailChannelRequest deleteEmailChannelRequest);

    /**
     * <p>
     * Deletes an endpoint from an application.
     * </p>
     * 
     * @param deleteEndpointRequest
     * @return Result of the DeleteEndpoint operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEndpointResult deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest);

    /**
     * <p>
     * Deletes the event stream for an application.
     * </p>
     * 
     * @param deleteEventStreamRequest
     * @return Result of the DeleteEventStream operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEventStreamResult deleteEventStream(DeleteEventStreamRequest deleteEventStreamRequest);

    /**
     * <p>
     * Disables the GCM channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteGcmChannelRequest
     * @return Result of the DeleteGcmChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGcmChannelResult deleteGcmChannel(DeleteGcmChannelRequest deleteGcmChannelRequest);

    /**
     * <p>
     * Deletes a segment from an application.
     * </p>
     * 
     * @param deleteSegmentRequest
     * @return Result of the DeleteSegment operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSegment" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSegmentResult deleteSegment(DeleteSegmentRequest deleteSegmentRequest);

    /**
     * <p>
     * Disables the SMS channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteSmsChannelRequest
     * @return Result of the DeleteSmsChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSmsChannelResult deleteSmsChannel(DeleteSmsChannelRequest deleteSmsChannelRequest);

    /**
     * <p>
     * Deletes all the endpoints that are associated with a specific user ID.
     * </p>
     * 
     * @param deleteUserEndpointsRequest
     * @return Result of the DeleteUserEndpoints operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteUserEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteUserEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteUserEndpointsResult deleteUserEndpoints(DeleteUserEndpointsRequest deleteUserEndpointsRequest);

    /**
     * <p>
     * Disables the voice channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteVoiceChannelRequest
     * @return Result of the DeleteVoiceChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.DeleteVoiceChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteVoiceChannel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteVoiceChannelResult deleteVoiceChannel(DeleteVoiceChannelRequest deleteVoiceChannelRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the ADM channel for an application.
     * </p>
     * 
     * @param getAdmChannelRequest
     * @return Result of the GetAdmChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetAdmChannelResult getAdmChannel(GetAdmChannelRequest getAdmChannelRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs channel for an application.
     * </p>
     * 
     * @param getApnsChannelRequest
     * @return Result of the GetApnsChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetApnsChannelResult getApnsChannel(GetApnsChannelRequest getApnsChannelRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs sandbox channel for an application.
     * </p>
     * 
     * @param getApnsSandboxChannelRequest
     * @return Result of the GetApnsSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsSandboxChannel" target="_top">AWS
     *      API Documentation</a>
     */
    GetApnsSandboxChannelResult getApnsSandboxChannel(GetApnsSandboxChannelRequest getApnsSandboxChannelRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs VoIP channel for an application.
     * </p>
     * 
     * @param getApnsVoipChannelRequest
     * @return Result of the GetApnsVoipChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    GetApnsVoipChannelResult getApnsVoipChannel(GetApnsVoipChannelRequest getApnsVoipChannelRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs VoIP sandbox channel for an application.
     * </p>
     * 
     * @param getApnsVoipSandboxChannelRequest
     * @return Result of the GetApnsVoipSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    GetApnsVoipSandboxChannelResult getApnsVoipSandboxChannel(GetApnsVoipSandboxChannelRequest getApnsVoipSandboxChannelRequest);

    /**
     * <p>
     * Retrieves information about an application.
     * </p>
     * 
     * @param getAppRequest
     * @return Result of the GetApp operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    GetAppResult getApp(GetAppRequest getAppRequest);

    /**
     * <p>
     * Retrieves information about the settings for an application.
     * </p>
     * 
     * @param getApplicationSettingsRequest
     * @return Result of the GetApplicationSettings operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetApplicationSettingsResult getApplicationSettings(GetApplicationSettingsRequest getApplicationSettingsRequest);

    /**
     * <p>
     * Retrieves information about all of your applications.
     * </p>
     * 
     * @param getAppsRequest
     * @return Result of the GetApps operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApps" target="_top">AWS API
     *      Documentation</a>
     */
    GetAppsResult getApps(GetAppsRequest getAppsRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the Baidu Cloud Push channel for an application.
     * </p>
     * 
     * @param getBaiduChannelRequest
     * @return Result of the GetBaiduChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetBaiduChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetBaiduChannelResult getBaiduChannel(GetBaiduChannelRequest getBaiduChannelRequest);

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for a campaign.
     * </p>
     * 
     * @param getCampaignRequest
     * @return Result of the GetCampaign operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    GetCampaignResult getCampaign(GetCampaignRequest getCampaignRequest);

    /**
     * <p>
     * Retrieves information about the activity performed by a campaign.
     * </p>
     * 
     * @param getCampaignActivitiesRequest
     * @return Result of the GetCampaignActivities operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetCampaignActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignActivities" target="_top">AWS
     *      API Documentation</a>
     */
    GetCampaignActivitiesResult getCampaignActivities(GetCampaignActivitiesRequest getCampaignActivitiesRequest);

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for a specific version of a campaign.
     * </p>
     * 
     * @param getCampaignVersionRequest
     * @return Result of the GetCampaignVersion operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetCampaignVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignVersion" target="_top">AWS
     *      API Documentation</a>
     */
    GetCampaignVersionResult getCampaignVersion(GetCampaignVersionRequest getCampaignVersionRequest);

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for all versions of a specific
     * campaign.
     * </p>
     * 
     * @param getCampaignVersionsRequest
     * @return Result of the GetCampaignVersions operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetCampaignVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignVersions" target="_top">AWS
     *      API Documentation</a>
     */
    GetCampaignVersionsResult getCampaignVersions(GetCampaignVersionsRequest getCampaignVersionsRequest);

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for all the campaigns that are
     * associated with an application.
     * </p>
     * 
     * @param getCampaignsRequest
     * @return Result of the GetCampaigns operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaigns" target="_top">AWS API
     *      Documentation</a>
     */
    GetCampaignsResult getCampaigns(GetCampaignsRequest getCampaignsRequest);

    /**
     * <p>
     * Retrieves information about the history and status of each channel for an application.
     * </p>
     * 
     * @param getChannelsRequest
     * @return Result of the GetChannels operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetChannels" target="_top">AWS API
     *      Documentation</a>
     */
    GetChannelsResult getChannels(GetChannelsRequest getChannelsRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the email channel for an application.
     * </p>
     * 
     * @param getEmailChannelRequest
     * @return Result of the GetEmailChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEmailChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetEmailChannelResult getEmailChannel(GetEmailChannelRequest getEmailChannelRequest);

    /**
     * <p>
     * Retrieves information about the settings and attributes of a specific endpoint for an application.
     * </p>
     * 
     * @param getEndpointRequest
     * @return Result of the GetEndpoint operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    GetEndpointResult getEndpoint(GetEndpointRequest getEndpointRequest);

    /**
     * <p>
     * Retrieves information about the event stream settings for an application.
     * </p>
     * 
     * @param getEventStreamRequest
     * @return Result of the GetEventStream operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    GetEventStreamResult getEventStream(GetEventStreamRequest getEventStreamRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of a specific export job for an application.
     * </p>
     * 
     * @param getExportJobRequest
     * @return Result of the GetExportJob operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetExportJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetExportJobResult getExportJob(GetExportJobRequest getExportJobRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of all the export jobs for an application.
     * </p>
     * 
     * @param getExportJobsRequest
     * @return Result of the GetExportJobs operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetExportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    GetExportJobsResult getExportJobs(GetExportJobsRequest getExportJobsRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the GCM channel for an application.
     * </p>
     * 
     * @param getGcmChannelRequest
     * @return Result of the GetGcmChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetGcmChannelResult getGcmChannel(GetGcmChannelRequest getGcmChannelRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of a specific import job for an application.
     * </p>
     * 
     * @param getImportJobRequest
     * @return Result of the GetImportJob operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetImportJobResult getImportJob(GetImportJobRequest getImportJobRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of all the import jobs for an application.
     * </p>
     * 
     * @param getImportJobsRequest
     * @return Result of the GetImportJobs operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetImportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    GetImportJobsResult getImportJobs(GetImportJobsRequest getImportJobsRequest);

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other settings for a specific segment that's
     * associated with an application.
     * </p>
     * 
     * @param getSegmentRequest
     * @return Result of the GetSegment operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegment" target="_top">AWS API
     *      Documentation</a>
     */
    GetSegmentResult getSegment(GetSegmentRequest getSegmentRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the export jobs for a segment.
     * </p>
     * 
     * @param getSegmentExportJobsRequest
     * @return Result of the GetSegmentExportJobs operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetSegmentExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    GetSegmentExportJobsResult getSegmentExportJobs(GetSegmentExportJobsRequest getSegmentExportJobsRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the import jobs for a segment.
     * </p>
     * 
     * @param getSegmentImportJobsRequest
     * @return Result of the GetSegmentImportJobs operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetSegmentImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    GetSegmentImportJobsResult getSegmentImportJobs(GetSegmentImportJobsRequest getSegmentImportJobsRequest);

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other settings for a specific version of a segment
     * that's associated with an application.
     * </p>
     * 
     * @param getSegmentVersionRequest
     * @return Result of the GetSegmentVersion operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetSegmentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentVersion" target="_top">AWS API
     *      Documentation</a>
     */
    GetSegmentVersionResult getSegmentVersion(GetSegmentVersionRequest getSegmentVersionRequest);

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other settings for all versions of a specific
     * segment that's associated with an application.
     * </p>
     * 
     * @param getSegmentVersionsRequest
     * @return Result of the GetSegmentVersions operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetSegmentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentVersions" target="_top">AWS
     *      API Documentation</a>
     */
    GetSegmentVersionsResult getSegmentVersions(GetSegmentVersionsRequest getSegmentVersionsRequest);

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other settings for all the segments that are
     * associated with an application.
     * </p>
     * 
     * @param getSegmentsRequest
     * @return Result of the GetSegments operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetSegments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegments" target="_top">AWS API
     *      Documentation</a>
     */
    GetSegmentsResult getSegments(GetSegmentsRequest getSegmentsRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the SMS channel for an application.
     * </p>
     * 
     * @param getSmsChannelRequest
     * @return Result of the GetSmsChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetSmsChannelResult getSmsChannel(GetSmsChannelRequest getSmsChannelRequest);

    /**
     * <p>
     * Retrieves information about all the endpoints that are associated with a specific user ID.
     * </p>
     * 
     * @param getUserEndpointsRequest
     * @return Result of the GetUserEndpoints operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetUserEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetUserEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    GetUserEndpointsResult getUserEndpoints(GetUserEndpointsRequest getUserEndpointsRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the voice channel for an application.
     * </p>
     * 
     * @param getVoiceChannelRequest
     * @return Result of the GetVoiceChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.GetVoiceChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetVoiceChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetVoiceChannelResult getVoiceChannel(GetVoiceChannelRequest getVoiceChannelRequest);

    /**
     * <p>
     * Retrieves all the tags (keys and values) that are associated with an application, campaign, or segment.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @sample AmazonPinpoint.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves information about a phone number.
     * </p>
     * 
     * @param phoneNumberValidateRequest
     * @return Result of the PhoneNumberValidate operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.PhoneNumberValidate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PhoneNumberValidate" target="_top">AWS
     *      API Documentation</a>
     */
    PhoneNumberValidateResult phoneNumberValidate(PhoneNumberValidateRequest phoneNumberValidateRequest);

    /**
     * <p>
     * Creates a new event stream for an application or updates the settings of an existing event stream for an
     * application.
     * </p>
     * 
     * @param putEventStreamRequest
     * @return Result of the PutEventStream operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.PutEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PutEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    PutEventStreamResult putEventStream(PutEventStreamRequest putEventStreamRequest);

    /**
     * <p>
     * Creates a new event to record for endpoints, or creates or updates endpoint data that existing events are
     * associated with.
     * </p>
     * 
     * @param putEventsRequest
     * @return Result of the PutEvents operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.PutEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PutEvents" target="_top">AWS API
     *      Documentation</a>
     */
    PutEventsResult putEvents(PutEventsRequest putEventsRequest);

    /**
     * <p>
     * Removes one or more attributes, of the same attribute type, from all the endpoints that are associated with an
     * application.
     * </p>
     * 
     * @param removeAttributesRequest
     * @return Result of the RemoveAttributes operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.RemoveAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/RemoveAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    RemoveAttributesResult removeAttributes(RemoveAttributesRequest removeAttributesRequest);

    /**
     * <p>
     * Creates and sends a direct message.
     * </p>
     * 
     * @param sendMessagesRequest
     * @return Result of the SendMessages operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.SendMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendMessages" target="_top">AWS API
     *      Documentation</a>
     */
    SendMessagesResult sendMessages(SendMessagesRequest sendMessagesRequest);

    /**
     * <p>
     * Creates and sends a message to a list of users.
     * </p>
     * 
     * @param sendUsersMessagesRequest
     * @return Result of the SendUsersMessages operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.SendUsersMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendUsersMessages" target="_top">AWS API
     *      Documentation</a>
     */
    SendUsersMessagesResult sendUsersMessages(SendUsersMessagesRequest sendUsersMessagesRequest);

    /**
     * <p>
     * Adds one or more tags (keys and values) to an application, campaign, or segment.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @sample AmazonPinpoint.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags (keys and values) from an application, campaign, or segment.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @sample AmazonPinpoint.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the ADM channel settings for an application.
     * </p>
     * 
     * @param updateAdmChannelRequest
     * @return Result of the UpdateAdmChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAdmChannelResult updateAdmChannel(UpdateAdmChannelRequest updateAdmChannelRequest);

    /**
     * <p>
     * Updates the APNs channel settings for an application.
     * </p>
     * 
     * @param updateApnsChannelRequest
     * @return Result of the UpdateApnsChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateApnsChannelResult updateApnsChannel(UpdateApnsChannelRequest updateApnsChannelRequest);

    /**
     * <p>
     * Updates the APNs sandbox channel settings for an application.
     * </p>
     * 
     * @param updateApnsSandboxChannelRequest
     * @return Result of the UpdateApnsSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApnsSandboxChannelResult updateApnsSandboxChannel(UpdateApnsSandboxChannelRequest updateApnsSandboxChannelRequest);

    /**
     * <p>
     * Updates the APNs VoIP channel settings for an application.
     * </p>
     * 
     * @param updateApnsVoipChannelRequest
     * @return Result of the UpdateApnsVoipChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateApnsVoipChannelResult updateApnsVoipChannel(UpdateApnsVoipChannelRequest updateApnsVoipChannelRequest);

    /**
     * <p>
     * Updates the settings for the APNs VoIP sandbox channel for an application.
     * </p>
     * 
     * @param updateApnsVoipSandboxChannelRequest
     * @return Result of the UpdateApnsVoipSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApnsVoipSandboxChannelResult updateApnsVoipSandboxChannel(UpdateApnsVoipSandboxChannelRequest updateApnsVoipSandboxChannelRequest);

    /**
     * <p>
     * Updates the settings for an application.
     * </p>
     * 
     * @param updateApplicationSettingsRequest
     * @return Result of the UpdateApplicationSettings operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApplicationSettingsResult updateApplicationSettings(UpdateApplicationSettingsRequest updateApplicationSettingsRequest);

    /**
     * <p>
     * Updates the settings of the Baidu channel for an application.
     * </p>
     * 
     * @param updateBaiduChannelRequest
     * @return Result of the UpdateBaiduChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateBaiduChannel" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateBaiduChannelResult updateBaiduChannel(UpdateBaiduChannelRequest updateBaiduChannelRequest);

    /**
     * <p>
     * Updates the settings for a campaign.
     * </p>
     * 
     * @param updateCampaignRequest
     * @return Result of the UpdateCampaign operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateCampaignResult updateCampaign(UpdateCampaignRequest updateCampaignRequest);

    /**
     * <p>
     * Updates the status and settings of the email channel for an application.
     * </p>
     * 
     * @param updateEmailChannelRequest
     * @return Result of the UpdateEmailChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEmailChannel" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateEmailChannelResult updateEmailChannel(UpdateEmailChannelRequest updateEmailChannelRequest);

    /**
     * <p>
     * Creates a new endpoint for an application or updates the settings and attributes of an existing endpoint for an
     * application. You can also use this operation to define custom attributes (Attributes, Metrics, and UserAttributes
     * properties) for an endpoint.
     * </p>
     * 
     * @param updateEndpointRequest
     * @return Result of the UpdateEndpoint operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateEndpointResult updateEndpoint(UpdateEndpointRequest updateEndpointRequest);

    /**
     * <p>
     * Creates a new batch of endpoints for an application or updates the settings and attributes of a batch of existing
     * endpoints for an application. You can also use this operation to define custom attributes (Attributes, Metrics,
     * and UserAttributes properties) for a batch of endpoints.
     * </p>
     * 
     * @param updateEndpointsBatchRequest
     * @return Result of the UpdateEndpointsBatch operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateEndpointsBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEndpointsBatch" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateEndpointsBatchResult updateEndpointsBatch(UpdateEndpointsBatchRequest updateEndpointsBatchRequest);

    /**
     * <p>
     * Updates the status and settings of the GCM channel for an application.
     * </p>
     * 
     * @param updateGcmChannelRequest
     * @return Result of the UpdateGcmChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGcmChannelResult updateGcmChannel(UpdateGcmChannelRequest updateGcmChannelRequest);

    /**
     * <p>
     * Creates a new segment for an application or updates the configuration, dimension, and other settings for an
     * existing segment that's associated with an application.
     * </p>
     * 
     * @param updateSegmentRequest
     * @return Result of the UpdateSegment operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSegmentResult updateSegment(UpdateSegmentRequest updateSegmentRequest);

    /**
     * <p>
     * Updates the status and settings of the SMS channel for an application.
     * </p>
     * 
     * @param updateSmsChannelRequest
     * @return Result of the UpdateSmsChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSmsChannelResult updateSmsChannel(UpdateSmsChannelRequest updateSmsChannelRequest);

    /**
     * <p>
     * Updates the status and settings of the voice channel for an application.
     * </p>
     * 
     * @param updateVoiceChannelRequest
     * @return Result of the UpdateVoiceChannel operation returned by the service.
     * @throws BadRequestException
     *         The request contains a syntax error (BadRequestException).
     * @throws InternalServerErrorException
     *         The request failed due to an unknown internal server error, exception, or failure
     *         (InternalServerErrorException).
     * @throws ForbiddenException
     *         The request was denied because access to the specified resource is forbidden (ForbiddenException).
     * @throws NotFoundException
     *         The request failed because the specified resource was not found (NotFoundException).
     * @throws MethodNotAllowedException
     *         The request failed because the method is not allowed for the specified resource
     *         (MethodNotAllowedException).
     * @throws TooManyRequestsException
     *         The request failed because too many requests were sent during a certain amount of time
     *         (TooManyRequestsException).
     * @sample AmazonPinpoint.UpdateVoiceChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateVoiceChannel" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateVoiceChannelResult updateVoiceChannel(UpdateVoiceChannelRequest updateVoiceChannelRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
