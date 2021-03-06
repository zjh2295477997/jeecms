package com.common.web.support.uuid.dao.dao;

import java.util.List;

import com.common.web.support.uuid.vo.UuidModel;
import com.common.web.support.uuid.vo.UuidQueryModel;

public interface UuidDAO <M extends UuidModel,Q extends UuidQueryModel>{

	public void create(M m);
	public void update(M m);
	public void delete(M m);
	
	public M getByUuid(Q qm,int uuid);
	public List<M> getAll(Q qm,int fromNum,int toNum);
	public List<M> getByCondition(Q qm,int fromNum,int toNum);
	public int getCount(Q qm);
}
