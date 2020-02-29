package dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public abstract class AbstractDAO <T, PK extends Serializable>{
	
		@SuppressWarnings("unchecked")
		private final Class<T> entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];;

		@PersistenceContext
		private EntityManager entityManager;
		
	
		protected EntityManager getEntityManager() {
			return this.entityManager;
		}
		
		public void save(T objeto) {
			this.entityManager.persist(objeto);
		}
		public void remove(PK id) {
			this.entityManager.remove(this.entityManager.getReference(entityClass, id));
		}
		public void update(T objeto) {
			this.entityManager.merge(objeto);
		}
		public T findById(PK id) {
			return this.entityManager.find(entityClass, id);
		}
		public List<T> getAll(){
			return this.entityManager.createQuery("from" + entityClass.getSimpleName(), entityClass).getResultList();
		}
		
		protected List<T> createQuery(String jpql, Object... params){
			TypedQuery<T> query = this.entityManager.createQuery(jpql, this.entityClass);
			
			for(int i=0; i < params.length; i++) {
				query.setParameter((i+1), params[i]);
			}
			return query.getResultList();
		}
		
		
}
