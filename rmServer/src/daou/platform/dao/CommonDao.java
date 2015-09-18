package daou.platform.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

/**
 * <code>CommonDao.java</code>
 * @Description : 공통 Dao Interface
 * @author : redkarisma
 * @modify : yoonsm
 * @since 2015. 1. 2.
 * @version 1.0
 */
public interface CommonDao {

	/**
	 * @Description : 공통 Dao Insert Method
	 * @author : redkarisma
	 * @param queryId 쿼리ID
	 * @param model 파라미터값이 들어있는 POJO모델객체
	 * @return Insert 결과
	 * @throws DataAccessException
	 */
	public int insert(String queryId, Object model) throws DataAccessException;

	/**
	 * @Description : 공통 Dao Update Method
	 * @author : redkarisma
	 * @param queryId 쿼리ID
	 * @param model 파라미터값이 들어있는 POJO모델객체
	 * @return Update 결과
	 * @throws DataAccessException
	 */
	public int update(String queryId, Object model) throws DataAccessException;
	
	/**
	 * @Description : 공통 Dao Delete Method
	 * @author : redkarisma
	 * @param queryId 쿼리ID
	 * @param model 파라미터값이 들어있는 POJO모델객체
	 * @return Delete 결과
	 * @throws DataAccessException
	 */
	public int delete(String queryId, Object model) throws DataAccessException;

	/**
	 * @Description : 리스트 조회 공통 Dao Select Method
	 * @author : redkarisma
	 * @param queryId 쿼리ID
	 * @param type 모델객체의 타입
	 * @return POJO모델객체 리스트
	 * @throws DataAccessException
	 */
	public <T> List<T> selectList(String queryId, Class<T> type) throws DataAccessException;
	
	/**
	 * @Description : 리스트 조회 공통 Dao Select Method
	 * @author : redkarisma
	 * @param queryId 쿼리ID
	 * @param params 쿼리파라미터
	 * @param type 모델객체의 타입
	 * @return POJO모델객체 리스트
	 * @throws DataAccessException
	 */
	public <T> List<T> selectList(String queryId, Map<String, Object> params, Class<T> type) throws DataAccessException;

	/**
	 * 1건 조회 공통 Dao Select Method
	 * @author redkarisma
	 * @param queryId 쿼리ID
	 * @param type 리턴될 모델객체의 타입
	 * @return POJO모델객체
	 * @throws DataAccessException
	 */
	public <T> T selectOne(String queryId, Class<T> type) throws DataAccessException;
	
	/**
	 * 1건 조회 공통 Dao Select Method
	 * @author redkarisma
	 * @param queryId 쿼리ID
	 * @param params 쿼리파라미터
	 * @param type 리턴될 모델객체의 타입
	 * @return POJO모델객체
	 * @throws DataAccessException
	 */
	public <T> T selectOne(String queryId, Map<String, Object> params, Class<T> type) throws DataAccessException;
	
	/**
	 * 1건 조회 공통
	 * <pre>TAData를 대체할 수 있는 심플한 Select 메소드</pre>
	 * @author suzhy
	 * @param queryId 쿼리ID
	 * @param params 쿼리파라미터
	 * @return Map<String, String> 객체
	 * @throws DataAccessException
	 */
	public Map<String, String> selectOne(String queryId, Map<String, Object> params) throws DataAccessException;

}