/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing_nov_6th.salesdb.service;

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

import com.testing_nov_6th.salesdb.Leads;
import com.testing_nov_6th.salesdb.Quotes;

/**
 * Service object for domain model class {@link Leads}.
 */
public interface LeadsService {

    /**
     * Creates a new Leads. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Leads if any.
     *
     * @param leads Details of the Leads to be created; value cannot be null.
     * @return The newly created Leads.
     */
	Leads create(@Valid Leads leads);


	/**
	 * Returns Leads by given id if exists.
	 *
	 * @param leadsId The id of the Leads to get; value cannot be null.
	 * @return Leads associated with the given leadsId.
     * @throws EntityNotFoundException If no Leads is found.
	 */
	Leads getById(Integer leadsId) throws EntityNotFoundException;

    /**
	 * Find and return the Leads by given id if exists, returns null otherwise.
	 *
	 * @param leadsId The id of the Leads to get; value cannot be null.
	 * @return Leads associated with the given leadsId.
	 */
	Leads findById(Integer leadsId);


	/**
	 * Updates the details of an existing Leads. It replaces all fields of the existing Leads with the given leads.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on Leads if any.
     *
	 * @param leads The details of the Leads to be updated; value cannot be null.
	 * @return The updated Leads.
	 * @throws EntityNotFoundException if no Leads is found with given input.
	 */
	Leads update(@Valid Leads leads) throws EntityNotFoundException;

    /**
	 * Deletes an existing Leads with the given id.
	 *
	 * @param leadsId The id of the Leads to be deleted; value cannot be null.
	 * @return The deleted Leads.
	 * @throws EntityNotFoundException if no Leads found with the given id.
	 */
	Leads delete(Integer leadsId) throws EntityNotFoundException;

	/**
	 * Find all Leads matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Leads.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<Leads> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all Leads matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Leads.
     *
     * @see Pageable
     * @see Page
	 */
    Page<Leads> findAll(String query, Pageable pageable);

    /**
	 * Exports all Leads matching the given input query to the given exportType format.
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
	 * Retrieve the count of the Leads in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the Leads.
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

    /*
     * Returns the associated quoteses for given Leads id.
     *
     * @param id value of id; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated Quotes instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<Quotes> findAssociatedQuoteses(Integer id, Pageable pageable);

}

