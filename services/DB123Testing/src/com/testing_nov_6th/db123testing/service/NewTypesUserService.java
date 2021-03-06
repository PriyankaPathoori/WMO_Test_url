/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing_nov_6th.db123testing.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testing_nov_6th.db123testing.NewTypesUser;

/**
 * Service object for domain model class {@link NewTypesUser}.
 */
public interface NewTypesUserService {

    /**
     * Creates a new NewTypesUser. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on NewTypesUser if any.
     *
     * @param newTypesUser Details of the NewTypesUser to be created; value cannot be null.
     * @return The newly created NewTypesUser.
     */
	NewTypesUser create(@Valid NewTypesUser newTypesUser);


	/**
	 * Returns NewTypesUser by given id if exists.
	 *
	 * @param newtypesuserId The id of the NewTypesUser to get; value cannot be null.
	 * @return NewTypesUser associated with the given newtypesuserId.
     * @throws EntityNotFoundException If no NewTypesUser is found.
	 */
	NewTypesUser getById(Integer newtypesuserId) throws EntityNotFoundException;

    /**
	 * Find and return the NewTypesUser by given id if exists, returns null otherwise.
	 *
	 * @param newtypesuserId The id of the NewTypesUser to get; value cannot be null.
	 * @return NewTypesUser associated with the given newtypesuserId.
	 */
	NewTypesUser findById(Integer newtypesuserId);


	/**
	 * Updates the details of an existing NewTypesUser. It replaces all fields of the existing NewTypesUser with the given newTypesUser.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on NewTypesUser if any.
     *
	 * @param newTypesUser The details of the NewTypesUser to be updated; value cannot be null.
	 * @return The updated NewTypesUser.
	 * @throws EntityNotFoundException if no NewTypesUser is found with given input.
	 */
	NewTypesUser update(@Valid NewTypesUser newTypesUser) throws EntityNotFoundException;

    /**
	 * Deletes an existing NewTypesUser with the given id.
	 *
	 * @param newtypesuserId The id of the NewTypesUser to be deleted; value cannot be null.
	 * @return The deleted NewTypesUser.
	 * @throws EntityNotFoundException if no NewTypesUser found with the given id.
	 */
	NewTypesUser delete(Integer newtypesuserId) throws EntityNotFoundException;

	/**
	 * Find all NewTypesUsers matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching NewTypesUsers.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<NewTypesUser> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all NewTypesUsers matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching NewTypesUsers.
     *
     * @see Pageable
     * @see Page
	 */
    Page<NewTypesUser> findAll(String query, Pageable pageable);

    /**
	 * Exports all NewTypesUsers matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
	 */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the NewTypesUsers in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the NewTypesUser.
	 */
	long count(String query);

	/**
	 * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
	 * @return Paginated data with included fields.

     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
	Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);


}

