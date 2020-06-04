package com.tyss.nifirestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.nifirestapi.dto.NifiBean;
import com.tyss.nifirestapi.repository.NifiRepository;

@Service
public class NifiServiceImpl implements NifiService {
	
	@Autowired
	private NifiRepository nifiRepository;
	
	@Override
	public NifiBean putData(NifiBean bean) {
		return nifiRepository.save(bean);
	}

	@Override
	public List<NifiBean> getAllData() {
		return nifiRepository.findAll();
	}

	@Override
	public NifiBean getData(int id) {
		return nifiRepository.getOne(id);
	}

}
