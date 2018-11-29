package com.skyeye.company.dao;

import java.util.List;
import java.util.Map;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

public interface CompanyJobDao {

	public List<Map<String, Object>> queryCompanyJobList(Map<String, Object> map, PageBounds pageBounds) throws Exception;

	public int insertCompanyJobMation(Map<String, Object> map) throws Exception;

	public Map<String, Object> queryCompanyJobMationByName(Map<String, Object> map) throws Exception;

	public int deleteCompanyJobMationById(Map<String, Object> map) throws Exception;

	public Map<String, Object> queryCompanyJobMationToEditById(Map<String, Object> map) throws Exception;

	public Map<String, Object> queryCompanyJobMationByNameAndId(Map<String, Object> map) throws Exception;

	public int editCompanyJobMationById(Map<String, Object> map) throws Exception;

}