package com.tyss.nifirestapi.service;

import java.util.List;

import com.tyss.nifirestapi.dto.NifiBean;

public interface NifiService {
	NifiBean putData(NifiBean bean);
	List<NifiBean> getAllData();
	NifiBean getData(int id);
}
