package com.media.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.media.dao.ShowRepo;

@Service
public class ShowService {

	@Autowired
	ShowRepo showRepo;
}
