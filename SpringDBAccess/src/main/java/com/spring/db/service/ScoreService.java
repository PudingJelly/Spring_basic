package com.spring.db.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.db.model.ScoreVO;

@Service
public class ScoreService implements IScoreService {

	@Override
	public void insertScore(ScoreVO vo) {

	}

	@Override
	public List<ScoreVO> selectAllScores() {
		return null;
	}

	@Override
	public void deleteScore(int num) {

	}

	@Override
	public ScoreVO selectOne(int num) {
		return null;
	}

}
