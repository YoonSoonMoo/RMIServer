package daou.platform.dao;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;

/**
 * 공통 Dao Implement
 * @author yoonsm
 * @since 2015. 1. 2.
 * @version 1.1
 * @modify
 * 2015.04.08 : 쿼리 실행 중 에러 발생시 DataAccessException 그대로 던지도록 수정 <br>
 */
public class CommonDaoImpl implements CommonDao {
	
	private SqlSession sqlSession;

	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	private static final Log log = LogFactory.getLog(CommonDaoImpl.class);
	
	@Override
	public int insert(String queryId, Object model) throws DataAccessException {

		log.info("insert parameter("+queryId+") ==> " + model);
		
		if (StringUtils.isBlank(queryId)) {
			throw new RuntimeException("insert parameter queryId is empty");
		}
		
		if (model == null) {
			throw new RuntimeException("insert parameter model is empty");
		}

		return getSqlSession().insert(queryId, model);
	}

	@Override
	public int update(String queryId, Object model) throws DataAccessException {

		log.info("update parameter("+queryId+") ==> " + model);
		
		if (StringUtils.isBlank(queryId)) {
			throw new RuntimeException("update parameter queryId is empty");
		}

		if (model == null) {
			throw new RuntimeException("update parameter model is empty");
		}

		return getSqlSession().update(queryId, model);
	}

	@Override
	public int delete(String queryId, Object model) throws DataAccessException {

		log.info("delete parameter("+queryId+") ==> " + model);
		
		if (StringUtils.isBlank(queryId)) {
			throw new RuntimeException("delete parameter queryId is empty");
		}

		if (model == null) {
			throw new RuntimeException("delete parameter model is empty");
		}

		return getSqlSession().delete(queryId, model);
	}
	
	public <T> List<T> selectList(String queryId, Class<T> type) throws DataAccessException {
		
		log.info("selectList parameter("+queryId+")");
		
		if (StringUtils.isBlank(queryId)) {
			throw new RuntimeException("selectList parameter queryId is empty");
		}

		return getSqlSession().selectList(queryId);
	}
	
	@Override
	public <T> List<T> selectList(String queryId, Map<String, Object> params, Class<T> type) throws DataAccessException {

		log.info("selectList parameter("+queryId+") ==> [" + params + "]");

		if (StringUtils.isBlank(queryId)) {
			throw new RuntimeException("selectList parameter queryId is empty");
		}
		
		return getSqlSession().selectList(queryId, params);
	}
	
	@Override
	public <T> T selectOne(String queryId, Class<T> type) throws DataAccessException {

		log.info("selectOne parameter("+queryId+")");
		
		if (StringUtils.isBlank(queryId)) {
			throw new RuntimeException("selectOne parameter queryId is empty");
		}
		
		return getSqlSession().selectOne(queryId);
	}
	
	@Override
	public <T> T selectOne(String queryId, Map<String, Object> params, Class<T> type) throws DataAccessException {
		
		log.info("selectOne parameter("+queryId+") ==> [" + params + "]");
		
		if (StringUtils.isBlank(queryId)) {
			throw new RuntimeException("selectOne parameter queryId is empty");
		}
		
		return getSqlSession().selectOne(queryId, params);
	}
	
	@Override
	public Map<String, String> selectOne(String queryId, Map<String, Object> params) throws DataAccessException {
		
		log.info("selectOne parameter("+queryId+") ==> [" + params + "]");
		
		if (StringUtils.isBlank(queryId)) {
			throw new RuntimeException("selectOne parameter queryId is empty");
		}
		
		return getSqlSession().selectOne(queryId, params);
	}
	
}
