/*
  Copyright (c) 2002, 2016, Oracle and/or its affiliates. All rights reserved.

  The MySQL Connector/J is licensed under the terms of the GPLv2
  <http://www.gnu.org/licenses/old-licenses/gpl-2.0.html>, like most MySQL Connectors.
  There are special exceptions to the terms and conditions of the GPLv2 as it is applied to
  this software, see the FOSS License Exception
  <http://www.mysql.com/about/legal/licensing/foss-exception.html>.

  This program is free software; you can redistribute it and/or modify it under the terms
  of the GNU General Public License as published by the Free Software Foundation; version 2
  of the License.

  This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
  See the GNU General Public License for more details.

  You should have received a copy of the GNU General Public License along with this
  program; if not, write to the Free Software Foundation, Inc., 51 Franklin St, Fifth
  Floor, Boston, MA 02110-1301  USA

 */

package com.mysql.jdbc;

import java.sql.SQLException;

public interface ConnectionProperties {

    /**
     * Returns a description of the connection properties as an XML document.
     *
     * @return the connection properties as an XML document.
     * @throws SQLException if an error occurs.
     */
    public String exposeAsXml() throws SQLException;

    public boolean getAllowLoadLocalInfile();

    public void setAllowLoadLocalInfile(boolean property);

    public boolean getAllowMultiQueries();

    /**
     * @param property
     */
    public void setAllowMultiQueries(boolean property);

    /**
     * @return Returns the allowNanAndInf.
     */
    public boolean getAllowNanAndInf();

    /**
     * @param allowNanAndInf The allowNanAndInf to set.
     */
    public void setAllowNanAndInf(boolean flag);

    /**
     * @return Returns the allowUrlInLocalInfile.
     */
    public boolean getAllowUrlInLocalInfile();

    /**
     * @param allowUrlInLocalInfile The allowUrlInLocalInfile to set.
     */
    public void setAllowUrlInLocalInfile(boolean flag);

    /**
     * @return Returns the alwaysSendSetIsolation.
     */
    public boolean getAlwaysSendSetIsolation();

    /**
     * @param alwaysSendSetIsolation The alwaysSendSetIsolation to set.
     */
    public void setAlwaysSendSetIsolation(boolean flag);

    /**
     * @return Returns the autoDeserialize.
     */
    public boolean getAutoDeserialize();

    /**
     * @param autoDeserialize The autoDeserialize to set.
     */
    public void setAutoDeserialize(boolean flag);

    public boolean getAutoGenerateTestcaseScript();

    public void setAutoGenerateTestcaseScript(boolean flag);

    public boolean getAutoReconnectForPools();

    /**
     * @param flag The autoReconnectForPools to set.
     */
    public void setAutoReconnectForPools(boolean flag);

    /**
     * @return Returns the blobSendChunkSize.
     */
    public int getBlobSendChunkSize();

    /**
     * @param blobSendChunkSize The blobSendChunkSize to set.
     */
    public void setBlobSendChunkSize(String value) throws SQLException;

    /**
     * @return Returns if cacheCallableStatements is enabled
     */
    public boolean getCacheCallableStatements();

    /**
     * @param flag The cacheCallableStatements to set.
     */
    public void setCacheCallableStatements(boolean flag);

    /**
     * @return Returns the cachePreparedStatements.
     */
    public boolean getCachePreparedStatements();

    /**
     * @param flag The cachePreparedStatements to set.
     */
    public void setCachePreparedStatements(boolean flag);

    public boolean getCacheResultSetMetadata();

    /**
     * Sets whether or not we should cache result set metadata.
     *
     * @param property
     */
    public void setCacheResultSetMetadata(boolean property);

    /**
     * @return Returns the cacheServerConfiguration.
     */
    public boolean getCacheServerConfiguration();

    /**
     * @param cacheServerConfiguration The cacheServerConfiguration to set.
     */
    public void setCacheServerConfiguration(boolean flag);

    /**
     * @return Returns the callableStatementCacheSize.
     */
    public int getCallableStatementCacheSize();

    /**
     * Configures the number of callable statements to cache. (this is
     * configurable during the life of the connection).
     *
     * @param size The callableStatementCacheSize to set.
     * @throws SQLException
     */
    public void setCallableStatementCacheSize(int size) throws SQLException;

    public boolean getCapitalizeTypeNames();

    /**
     * @param flag The capitalizeTypeNames to set.
     */
    public void setCapitalizeTypeNames(boolean flag);

    /**
     * @return Returns the characterSetResults.
     */
    public String getCharacterSetResults();

    /**
     * @param characterSet The characterSetResults to set.
     */
    public void setCharacterSetResults(String characterSet);

    /**
     * @return Returns the clobberStreamingResults.
     */
    public boolean getClobberStreamingResults();

    /**
     * @param flag The clobberStreamingResults to set.
     */
    public void setClobberStreamingResults(boolean flag);

    public String getClobCharacterEncoding();

    public void setClobCharacterEncoding(String encoding);

    /**
     * @return Returns the connectionCollation.
     */
    public String getConnectionCollation();

    /**
     * @param collation The connectionCollation to set.
     */
    public void setConnectionCollation(String collation);

    public int getConnectTimeout();

    /**
     * @param timeoutMs
     * @throws SQLException
     */
    public void setConnectTimeout(int timeoutMs) throws SQLException;

    public boolean getContinueBatchOnError();

    /**
     * @param property
     */
    public void setContinueBatchOnError(boolean property);

    public boolean getCreateDatabaseIfNotExist();

    public void setCreateDatabaseIfNotExist(boolean flag);

    public int getDefaultFetchSize();

    public void setDefaultFetchSize(int n) throws SQLException;

    /**
     * @return Returns the dontTrackOpenResources.
     */
    public boolean getDontTrackOpenResources();

    /**
     * @param dontTrackOpenResources The dontTrackOpenResources to set.
     */
    public void setDontTrackOpenResources(boolean flag);

    /**
     * @return Returns the dumpQueriesOnException.
     */
    public boolean getDumpQueriesOnException();

    /**
     * @param flag The dumpQueriesOnException to set.
     */
    public void setDumpQueriesOnException(boolean flag);

    /**
     * @return Returns the dynamicCalendars.
     */
    public boolean getDynamicCalendars();

    /**
     * @param dynamicCalendars The dynamicCalendars to set.
     */
    public void setDynamicCalendars(boolean flag);

    /**
     * @return Returns the elideSetAutoCommits.
     */
    public boolean getElideSetAutoCommits();

    /**
     * @param flag The elideSetAutoCommits to set.
     */
    public void setElideSetAutoCommits(boolean flag);

    public boolean getEmptyStringsConvertToZero();

    public void setEmptyStringsConvertToZero(boolean flag);

    public boolean getEmulateLocators();

    /**
     * @param property
     */
    public void setEmulateLocators(boolean property);

    /**
     * @return Returns the emulateUnsupportedPstmts.
     */
    public boolean getEmulateUnsupportedPstmts();

    /**
     * @param emulateUnsupportedPstmts The emulateUnsupportedPstmts to set.
     */
    public void setEmulateUnsupportedPstmts(boolean flag);

    /**
     * @return Returns the enablePacketDebug.
     */
    public boolean getEnablePacketDebug();

    /**
     * @param flag The enablePacketDebug to set.
     */
    public void setEnablePacketDebug(boolean flag);

    public String getEncoding();

    /**
     * @param property
     */
    public void setEncoding(String property);

    /**
     * @return Returns the explainSlowQueries.
     */
    public boolean getExplainSlowQueries();

    /**
     * @param flag The explainSlowQueries to set.
     */
    public void setExplainSlowQueries(boolean flag);

    /**
     * @return Returns the failOverReadOnly.
     */
    public boolean getFailOverReadOnly();

    /**
     * @param flag The failOverReadOnly to set.
     */
    public void setFailOverReadOnly(boolean flag);

    /**
     * @return Returns the gatherPerformanceMetrics.
     */
    public boolean getGatherPerformanceMetrics();

    /**
     * @param flag The gatherPerformanceMetrics to set.
     */
    public void setGatherPerformanceMetrics(boolean flag);

    /**
     * @return Returns the holdResultsOpenOverStatementClose.
     */
    public boolean getHoldResultsOpenOverStatementClose();

    /**
     * @param holdResultsOpenOverStatementClose The holdResultsOpenOverStatementClose to set.
     */
    public void setHoldResultsOpenOverStatementClose(boolean flag);

    public boolean getIgnoreNonTxTables();

    /**
     * @param property
     */
    public void setIgnoreNonTxTables(boolean property);

    public int getInitialTimeout();

    /**
     * @param property
     * @throws SQLException
     */
    public void setInitialTimeout(int property) throws SQLException;

    public boolean getInteractiveClient();

    public void setInteractiveClient(boolean property);

    /**
     * @return Returns the isInteractiveClient.
     */
    public boolean getIsInteractiveClient();

    /**
     * @param property
     */
    public void setIsInteractiveClient(boolean property);

    /**
     * @return Returns the jdbcCompliantTruncation.
     */
    public boolean getJdbcCompliantTruncation();

    /**
     * @param flag The jdbcCompliantTruncation to set.
     */
    public void setJdbcCompliantTruncation(boolean flag);

    /**
     * @return Returns the dontTrackOpenResources.
     */
    public int getLocatorFetchBufferSize();

    /**
     * @param locatorFetchBufferSize The locatorFetchBufferSize to set.
     */
    public void setLocatorFetchBufferSize(String value) throws SQLException;

    public String getLogger();

    /**
     * @param property
     */
    public void setLogger(String property);

    /**
     * @return Returns the loggerClassName.
     */
    public String getLoggerClassName();

    /**
     * @param className The loggerClassName to set.
     */
    public void setLoggerClassName(String className);

    /**
     * @return Returns the logSlowQueries.
     */
    public boolean getLogSlowQueries();

    /**
     * @param flag The logSlowQueries to set.
     */
    public void setLogSlowQueries(boolean flag);

    public boolean getMaintainTimeStats();

    public void setMaintainTimeStats(boolean flag);

    /**
     * @return Returns the maxQuerySizeToLog.
     */
    public int getMaxQuerySizeToLog();

    /**
     * @param sizeInBytes The maxQuerySizeToLog to set.
     * @throws SQLException
     */
    public void setMaxQuerySizeToLog(int sizeInBytes) throws SQLException;

    public int getMaxReconnects();

    /**
     * @param property
     * @throws SQLException
     */
    public void setMaxReconnects(int property) throws SQLException;

    public int getMaxRows();

    /**
     * @param property
     * @throws SQLException
     */
    public void setMaxRows(int property) throws SQLException;

    /**
     * Returns the number of queries that metadata can be cached if caching is
     * enabled.
     *
     * @return the number of queries to cache metadata for.
     */
    public int getMetadataCacheSize();

    /**
     * Sets the number of queries that metadata can be cached if caching is
     * enabled.
     *
     * @param value the number of queries to cache metadata for.
     * @throws SQLException
     */
    public void setMetadataCacheSize(int value) throws SQLException;

    /**
     * @return Returns the noDatetimeStringSync.
     */
    public boolean getNoDatetimeStringSync();

    /**
     * @param noDatetimeStringSync The noDatetimeStringSync to set.
     */
    public void setNoDatetimeStringSync(boolean flag);

    public boolean getNullCatalogMeansCurrent();

    public void setNullCatalogMeansCurrent(boolean value);

    public boolean getNullNamePatternMatchesAll();

    public void setNullNamePatternMatchesAll(boolean value);

    /**
     * @return Returns the packetDebugBufferSize.
     */
    public int getPacketDebugBufferSize();

    /**
     * @param size The packetDebugBufferSize to set.
     * @throws SQLException
     */
    public void setPacketDebugBufferSize(int size) throws SQLException;

    public boolean getParanoid();

    /**
     * @param property
     */
    public void setParanoid(boolean property);

    public boolean getPedantic();

    /**
     * @param property
     */
    public void setPedantic(boolean property);

    /**
     * @return Returns the preparedStatementCacheSize.
     */
    public int getPreparedStatementCacheSize();

    /**
     * @param cacheSize The preparedStatementCacheSize to set.
     * @throws SQLException
     */
    public void setPreparedStatementCacheSize(int cacheSize) throws SQLException;

    /**
     * @return Returns the preparedStatementCacheSqlLimit.
     */
    public int getPreparedStatementCacheSqlLimit();

    /**
     * @param cacheSqlLimit The preparedStatementCacheSqlLimit to set.
     * @throws SQLException
     */
    public void setPreparedStatementCacheSqlLimit(int cacheSqlLimit) throws SQLException;

    public boolean getProfileSql();

    /**
     * @param property
     */
    public void setProfileSql(boolean property);

    /**
     * @return Returns the profileSQL flag
     */
    public boolean getProfileSQL();

    /**
     * @param flag The profileSQL to set.
     */
    public void setProfileSQL(boolean flag);

    /**
     * @return Returns the propertiesTransform.
     */
    public String getPropertiesTransform();

    /**
     * @param propertiesTransform The propertiesTransform to set.
     */
    public void setPropertiesTransform(String value);

    public int getQueriesBeforeRetryMaster();

    /**
     * @param property
     * @throws SQLException
     */
    public void setQueriesBeforeRetryMaster(int property) throws SQLException;

    public boolean getReconnectAtTxEnd();

    /**
     * @param property
     */
    public void setReconnectAtTxEnd(boolean property);

    public boolean getRelaxAutoCommit();

    /**
     * @param property
     */
    public void setRelaxAutoCommit(boolean property);

    /**
     * @return Returns the reportMetricsIntervalMillis.
     */
    public int getReportMetricsIntervalMillis();

    /**
     * @param millis The reportMetricsIntervalMillis to set.
     * @throws SQLException
     */
    public void setReportMetricsIntervalMillis(int millis) throws SQLException;

    public boolean getRequireSSL();

    /**
     * @param property
     */
    public void setRequireSSL(boolean property);

    /**
     * @return Returns the rollbackOnPooledClose.
     */
    public boolean getRollbackOnPooledClose();

    /**
     * @param rollbackOnPooledClose The rollbackOnPooledClose to set.
     */
    public void setRollbackOnPooledClose(boolean flag);

    /**
     * Returns whether or not hosts will be picked in a round-robin fashion.
     *
     * @return Returns the roundRobinLoadBalance property.
     */
    public boolean getRoundRobinLoadBalance();

    /**
     * Sets whether or not hosts will be picked in a round-robin fashion.
     *
     * @param flag The roundRobinLoadBalance property to set.
     */
    public void setRoundRobinLoadBalance(boolean flag);

    /**
     * @return Returns the runningCTS13.
     */
    public boolean getRunningCTS13();

    /**
     * @param runningCTS13 The runningCTS13 to set.
     */
    public void setRunningCTS13(boolean flag);

    public int getSecondsBeforeRetryMaster();

    /**
     * @param property
     * @throws SQLException
     */
    public void setSecondsBeforeRetryMaster(int property) throws SQLException;

    /**
     * Returns the 'serverTimezone' property.
     *
     * @return the configured server timezone property.
     */
    public String getServerTimezone();

    /**
     * @param property
     */
    public void setServerTimezone(String property);

    /**
     * @return Returns the sessionVariables.
     */
    public String getSessionVariables();

    /**
     * @param sessionVariables The sessionVariables to set.
     */
    public void setSessionVariables(String variables);

    /**
     * @return Returns the slowQueryThresholdMillis.
     */
    public int getSlowQueryThresholdMillis();

    /**
     * @param millis The slowQueryThresholdMillis to set.
     * @throws SQLException
     */
    public void setSlowQueryThresholdMillis(int millis) throws SQLException;

    public String getSocketFactoryClassName();

    /**
     * @param property
     */
    public void setSocketFactoryClassName(String property);

    public int getSocketTimeout();

    /**
     * @param property
     * @throws SQLException
     */
    public void setSocketTimeout(int property) throws SQLException;

    public boolean getStrictFloatingPoint();

    /**
     * @param property
     */
    public void setStrictFloatingPoint(boolean property);

    public boolean getStrictUpdates();

    /**
     * @param property
     */
    public void setStrictUpdates(boolean property);

    /**
     * @return Returns the tinyInt1isBit.
     */
    public boolean getTinyInt1isBit();

    /**
     * @param tinyInt1isBit The tinyInt1isBit to set.
     */
    public void setTinyInt1isBit(boolean flag);

    /**
     * @return Returns the logProtocol.
     */
    public boolean getTraceProtocol();

    /**
     * @param flag The logProtocol to set.
     */
    public void setTraceProtocol(boolean flag);

    public boolean getTransformedBitIsBoolean();

    public void setTransformedBitIsBoolean(boolean flag);

    public boolean getUseCompression();

    /**
     * @param property
     */
    public void setUseCompression(boolean property);

    /**
     * @return Returns the useFastIntParsing.
     */
    public boolean getUseFastIntParsing();

    /**
     * @param useFastIntParsing The useFastIntParsing to set.
     */
    public void setUseFastIntParsing(boolean flag);

    public boolean getUseHostsInPrivileges();

    /**
     * @param property
     */
    public void setUseHostsInPrivileges(boolean property);

    public boolean getUseInformationSchema();

    public void setUseInformationSchema(boolean flag);

    /**
     * @return Returns the useLocalSessionState.
     */
    public boolean getUseLocalSessionState();

    /**
     * @param useLocalSessionState The useLocalSessionState to set.
     */
    public void setUseLocalSessionState(boolean flag);

    /**
     * @return Returns the useOldUTF8Behavior.
     */
    public boolean getUseOldUTF8Behavior();

    /**
     * @param useOldUTF8Behavior The useOldUTF8Behavior to set.
     */
    public void setUseOldUTF8Behavior(boolean flag);

    /**
     * @return Returns the useOnlyServerErrorMessages.
     */
    public boolean getUseOnlyServerErrorMessages();

    /**
     * @param useOnlyServerErrorMessages The useOnlyServerErrorMessages to set.
     */
    public void setUseOnlyServerErrorMessages(boolean flag);

    /**
     * @return Returns the useReadAheadInput.
     */
    public boolean getUseReadAheadInput();

    /**
     * @param useReadAheadInput The useReadAheadInput to set.
     */
    public void setUseReadAheadInput(boolean flag);

    public boolean getUseServerPreparedStmts();

    /**
     * @param flag The detectServerPreparedStmts to set.
     */
    public void setUseServerPreparedStmts(boolean flag);

    /**
     * @return Returns the useSqlStateCodes state.
     */
    public boolean getUseSqlStateCodes();

    /**
     * @param flag The useSqlStateCodes to set.
     */
    public void setUseSqlStateCodes(boolean flag);

    public boolean getUseSSL();

    /**
     * @param property
     */
    public void setUseSSL(boolean property);

    boolean isUseSSLExplicit();

    public boolean getUseStreamLengthsInPrepStmts();

    /**
     * @param property
     */
    public void setUseStreamLengthsInPrepStmts(boolean property);

    public boolean getUseTimezone();

    /**
     * @param property
     */
    public void setUseTimezone(boolean property);

    public boolean getUseUltraDevWorkAround();

    /**
     * @param property
     */
    public void setUseUltraDevWorkAround(boolean property);

    /**
     * @return Returns the useUnbufferedInput.
     */
    public boolean getUseUnbufferedInput();

    /**
     * @param flag The useUnbufferedInput to set.
     */
    public void setUseUnbufferedInput(boolean flag);

    public boolean getUseUnicode();

    /**
     * @param flag The useUnicode to set.
     */
    public void setUseUnicode(boolean flag);

    /**
     * Returns whether or not the driver advises of proper usage.
     *
     * @return the value of useUsageAdvisor
     */
    public boolean getUseUsageAdvisor();

    /**
     * Sets whether or not the driver advises of proper usage.
     *
     * @param useUsageAdvisorFlag whether or not the driver advises of proper usage.
     */
    public void setUseUsageAdvisor(boolean useUsageAdvisorFlag);

    public boolean getYearIsDateType();

    public void setYearIsDateType(boolean flag);

    /**
     * @return Returns the zeroDateTimeBehavior.
     */
    public String getZeroDateTimeBehavior();

    /**
     * @param zeroDateTimeBehavior The zeroDateTimeBehavior to set.
     */
    public void setZeroDateTimeBehavior(String behavior);

    /**
     * @param flag The autoReconnect to set.
     */
    public void setAutoReconnect(boolean flag);

    public void setAutoReconnectForConnectionPools(boolean property);

    public void setCapitalizeDBMDTypes(boolean property);

    /**
     * @param encoding The characterEncoding to set.
     */
    public void setCharacterEncoding(String encoding);

    /**
     * @param property
     */
    public void setDetectServerPreparedStmts(boolean property);

    /**
     * @return Returns the useUnbufferedInput.
     */
    public boolean useUnbufferedInput();

    public boolean getUseCursorFetch();

    public void setUseCursorFetch(boolean flag);

    public boolean getOverrideSupportsIntegrityEnhancementFacility();

    public void setOverrideSupportsIntegrityEnhancementFacility(boolean flag);

    public boolean getNoTimezoneConversionForTimeType();

    public void setNoTimezoneConversionForTimeType(boolean flag);

    public boolean getNoTimezoneConversionForDateType();

    public void setNoTimezoneConversionForDateType(boolean flag);

    public boolean getCacheDefaultTimezone();

    public void setCacheDefaultTimezone(boolean flag);

    public boolean getUseJDBCCompliantTimezoneShift();

    public void setUseJDBCCompliantTimezoneShift(boolean flag);

    public boolean getAutoClosePStmtStreams();

    public void setAutoClosePStmtStreams(boolean flag);

    public boolean getProcessEscapeCodesForPrepStmts();

    public void setProcessEscapeCodesForPrepStmts(boolean flag);

    public boolean getUseGmtMillisForDatetimes();

    public void setUseGmtMillisForDatetimes(boolean flag);

    public boolean getDumpMetadataOnColumnNotFound();

    public void setDumpMetadataOnColumnNotFound(boolean flag);

    public String getResourceId();

    public void setResourceId(String resourceId);

    public boolean getRewriteBatchedStatements();

    public void setRewriteBatchedStatements(boolean flag);

    public boolean getJdbcCompliantTruncationForReads();

    public void setJdbcCompliantTruncationForReads(boolean jdbcCompliantTruncationForReads);

    public boolean getUseJvmCharsetConverters();

    public void setUseJvmCharsetConverters(boolean flag);

    public boolean getPinGlobalTxToPhysicalConnection();

    public void setPinGlobalTxToPhysicalConnection(boolean flag);

    public boolean getGatherPerfMetrics();

    public void setGatherPerfMetrics(boolean flag);

    public boolean getUltraDevHack();

    public void setUltraDevHack(boolean flag);

    public String getSocketFactory();

    public void setSocketFactory(String name);

    public boolean getUseServerPrepStmts();

    public void setUseServerPrepStmts(boolean flag);

    public boolean getCacheCallableStmts();

    public void setCacheCallableStmts(boolean flag);

    public boolean getCachePrepStmts();

    public void setCachePrepStmts(boolean flag);

    public int getCallableStmtCacheSize();

    public void setCallableStmtCacheSize(int cacheSize) throws SQLException;

    public int getPrepStmtCacheSize();

    public void setPrepStmtCacheSize(int cacheSize) throws SQLException;

    public int getPrepStmtCacheSqlLimit();

    public void setPrepStmtCacheSqlLimit(int sqlLimit) throws SQLException;

    public boolean getNoAccessToProcedureBodies();

    public void setNoAccessToProcedureBodies(boolean flag);

    public boolean getUseOldAliasMetadataBehavior();

    public void setUseOldAliasMetadataBehavior(boolean flag);

    public String getClientCertificateKeyStorePassword();

    public void setClientCertificateKeyStorePassword(String value);

    public String getClientCertificateKeyStoreType();

    public void setClientCertificateKeyStoreType(String value);

    public String getClientCertificateKeyStoreUrl();

    public void setClientCertificateKeyStoreUrl(String value);

    public String getTrustCertificateKeyStorePassword();

    public void setTrustCertificateKeyStorePassword(String value);

    public String getTrustCertificateKeyStoreType();

    public void setTrustCertificateKeyStoreType(String value);

    public String getTrustCertificateKeyStoreUrl();

    public void setTrustCertificateKeyStoreUrl(String value);

    public boolean getUseSSPSCompatibleTimezoneShift();

    public void setUseSSPSCompatibleTimezoneShift(boolean flag);

    public boolean getTreatUtilDateAsTimestamp();

    public void setTreatUtilDateAsTimestamp(boolean flag);

    public boolean getUseFastDateParsing();

    public void setUseFastDateParsing(boolean flag);

    public String getLocalSocketAddress();

    public void setLocalSocketAddress(String address);

    public String getUseConfigs();

    public void setUseConfigs(String configs);

    public boolean getGenerateSimpleParameterMetadata();

    public void setGenerateSimpleParameterMetadata(boolean flag);

    public boolean getLogXaCommands();

    public void setLogXaCommands(boolean flag);

    public int getResultSetSizeThreshold();

    public void setResultSetSizeThreshold(int threshold) throws SQLException;

    public int getNetTimeoutForStreamingResults();

    public void setNetTimeoutForStreamingResults(int value) throws SQLException;

    public boolean getEnableQueryTimeouts();

    public void setEnableQueryTimeouts(boolean flag);

    public boolean getPadCharsWithSpace();

    public void setPadCharsWithSpace(boolean flag);

    public boolean getUseDynamicCharsetInfo();

    public void setUseDynamicCharsetInfo(boolean flag);

    public String getClientInfoProvider();

    public void setClientInfoProvider(String classname);

    public boolean getPopulateInsertRowWithDefaultValues();

    public void setPopulateInsertRowWithDefaultValues(boolean flag);

    public String getLoadBalanceStrategy();

    public void setLoadBalanceStrategy(String strategy);

    public boolean getTcpNoDelay();

    public void setTcpNoDelay(boolean flag);

    public boolean getTcpKeepAlive();

    public void setTcpKeepAlive(boolean flag);

    public int getTcpRcvBuf();

    public void setTcpRcvBuf(int bufSize) throws SQLException;

    public int getTcpSndBuf();

    public void setTcpSndBuf(int bufSize) throws SQLException;

    public int getTcpTrafficClass();

    public void setTcpTrafficClass(int classFlags) throws SQLException;

    public boolean getUseNanosForElapsedTime();

    public void setUseNanosForElapsedTime(boolean flag);

    public long getSlowQueryThresholdNanos();

    public void setSlowQueryThresholdNanos(long nanos) throws SQLException;

    public String getStatementInterceptors();

    public void setStatementInterceptors(String value);

    public boolean getUseDirectRowUnpack();

    public void setUseDirectRowUnpack(boolean flag);

    public String getLargeRowSizeThreshold();

    public void setLargeRowSizeThreshold(String value) throws SQLException;

    public boolean getUseBlobToStoreUTF8OutsideBMP();

    public void setUseBlobToStoreUTF8OutsideBMP(boolean flag);

    public String getUtf8OutsideBmpExcludedColumnNamePattern();

    public void setUtf8OutsideBmpExcludedColumnNamePattern(String regexPattern);

    public String getUtf8OutsideBmpIncludedColumnNamePattern();

    public void setUtf8OutsideBmpIncludedColumnNamePattern(String regexPattern);

    public boolean getIncludeInnodbStatusInDeadlockExceptions();

    public void setIncludeInnodbStatusInDeadlockExceptions(boolean flag);

    public boolean getIncludeThreadDumpInDeadlockExceptions();

    public void setIncludeThreadDumpInDeadlockExceptions(boolean flag);

    public boolean getIncludeThreadNamesAsStatementComment();

    public void setIncludeThreadNamesAsStatementComment(boolean flag);

    public boolean getBlobsAreStrings();

    public void setBlobsAreStrings(boolean flag);

    public boolean getFunctionsNeverReturnBlobs();

    public void setFunctionsNeverReturnBlobs(boolean flag);

    public boolean getAutoSlowLog();

    public void setAutoSlowLog(boolean flag);

    public String getConnectionLifecycleInterceptors();

    public void setConnectionLifecycleInterceptors(String interceptors);

    public String getProfilerEventHandler();

    public void setProfilerEventHandler(String handler);

    public boolean getVerifyServerCertificate();

    public void setVerifyServerCertificate(boolean flag);

    public boolean getUseLegacyDatetimeCode();

    public void setUseLegacyDatetimeCode(boolean flag);

    public boolean getSendFractionalSeconds();

    public void setSendFractionalSeconds(boolean flag);

    public int getSelfDestructOnPingSecondsLifetime();

    public void setSelfDestructOnPingSecondsLifetime(int seconds) throws SQLException;

    public int getSelfDestructOnPingMaxOperations();

    public void setSelfDestructOnPingMaxOperations(int maxOperations) throws SQLException;

    public boolean getUseColumnNamesInFindColumn();

    public void setUseColumnNamesInFindColumn(boolean flag);

    public boolean getUseLocalTransactionState();

    public void setUseLocalTransactionState(boolean flag);

    public boolean getCompensateOnDuplicateKeyUpdateCounts();

    public void setCompensateOnDuplicateKeyUpdateCounts(boolean flag);

    public boolean getUseAffectedRows();

    public void setUseAffectedRows(boolean flag);

    public String getPasswordCharacterEncoding();

    public void setPasswordCharacterEncoding(String characterSet);

    public int getLoadBalanceBlacklistTimeout();

    public void setLoadBalanceBlacklistTimeout(int loadBalanceBlacklistTimeout) throws SQLException;

    public int getRetriesAllDown();

    public void setRetriesAllDown(int retriesAllDown) throws SQLException;

    public ExceptionInterceptor getExceptionInterceptor();

    public String getExceptionInterceptors();

    public void setExceptionInterceptors(String exceptionInterceptors);

    public boolean getQueryTimeoutKillsConnection();

    public void setQueryTimeoutKillsConnection(boolean queryTimeoutKillsConnection);

    public int getMaxAllowedPacket();

    boolean getRetainStatementAfterResultSetClose();

    public void setRetainStatementAfterResultSetClose(boolean flag);

    public int getLoadBalancePingTimeout();

    public void setLoadBalancePingTimeout(int loadBalancePingTimeout) throws SQLException;

    public boolean getLoadBalanceValidateConnectionOnSwapServer();

    public void setLoadBalanceValidateConnectionOnSwapServer(boolean loadBalanceValidateConnectionOnSwapServer);

    public String getLoadBalanceConnectionGroup();

    public void setLoadBalanceConnectionGroup(String loadBalanceConnectionGroup);

    public String getLoadBalanceExceptionChecker();

    public void setLoadBalanceExceptionChecker(String loadBalanceExceptionChecker);

    public String getLoadBalanceSQLStateFailover();

    public void setLoadBalanceSQLStateFailover(String loadBalanceSQLStateFailover);

    public String getLoadBalanceSQLExceptionSubclassFailover();

    public void setLoadBalanceSQLExceptionSubclassFailover(String loadBalanceSQLExceptionSubclassFailover);

    public boolean getLoadBalanceEnableJMX();

    public void setLoadBalanceEnableJMX(boolean loadBalanceEnableJMX);

    public int getLoadBalanceHostRemovalGracePeriod();

    public void setLoadBalanceHostRemovalGracePeriod(int loadBalanceHostRemovalGracePeriod) throws SQLException;

    public int getLoadBalanceAutoCommitStatementThreshold();

    public void setLoadBalanceAutoCommitStatementThreshold(int loadBalanceAutoCommitStatementThreshold) throws SQLException;

    public String getLoadBalanceAutoCommitStatementRegex();

    public void setLoadBalanceAutoCommitStatementRegex(String loadBalanceAutoCommitStatementRegex);

    public String getAuthenticationPlugins();

    public void setAuthenticationPlugins(String authenticationPlugins);

    public String getDisabledAuthenticationPlugins();

    public void setDisabledAuthenticationPlugins(String disabledAuthenticationPlugins);

    public String getDefaultAuthenticationPlugin();

    public void setDefaultAuthenticationPlugin(String defaultAuthenticationPlugin);

    public String getParseInfoCacheFactory();

    public void setParseInfoCacheFactory(String factoryClassname);

    public String getServerConfigCacheFactory();

    public void setServerConfigCacheFactory(String factoryClassname);

    public boolean getDisconnectOnExpiredPasswords();

    public void setDisconnectOnExpiredPasswords(boolean disconnectOnExpiredPasswords);

    public boolean getAllowMasterDownConnections();

    public void setAllowMasterDownConnections(boolean connectIfMasterDown);

    public boolean getAllowSlaveDownConnections();

    public void setAllowSlaveDownConnections(boolean connectIfSlaveDown);

    public boolean getReadFromMasterWhenNoSlaves();

    public void setReadFromMasterWhenNoSlaves(boolean useMasterIfSlavesDown);

    public boolean getReplicationEnableJMX();

    public void setReplicationEnableJMX(boolean replicationEnableJMX);

    public boolean getGetProceduresReturnsFunctions();

    public void setGetProceduresReturnsFunctions(boolean getProcedureReturnsFunctions);

    public boolean getDetectCustomCollations();

    public void setDetectCustomCollations(boolean detectCustomCollations);

    String getConnectionAttributes() throws SQLException;

    public String getServerRSAPublicKeyFile();

    public void setServerRSAPublicKeyFile(String serverRSAPublicKeyFile) throws SQLException;

    public boolean getAllowPublicKeyRetrieval();

    public void setAllowPublicKeyRetrieval(boolean allowPublicKeyRetrieval) throws SQLException;

    public boolean getDontCheckOnDuplicateKeyUpdateInSQL();

    public void setDontCheckOnDuplicateKeyUpdateInSQL(boolean dontCheckOnDuplicateKeyUpdateInSQL);

    public String getSocksProxyHost();

    public void setSocksProxyHost(String socksProxyHost);

    public int getSocksProxyPort();

    public void setSocksProxyPort(int socksProxyPort) throws SQLException;

    public boolean getReadOnlyPropagatesToServer();

    public void setReadOnlyPropagatesToServer(boolean flag);

    public String getEnabledSSLCipherSuites();

    public void setEnabledSSLCipherSuites(String cipherSuites);

    public boolean getEnableEscapeProcessing();

    public void setEnableEscapeProcessing(boolean flag);
}
