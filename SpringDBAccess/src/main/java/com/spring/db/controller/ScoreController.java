package com.spring.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.db.model.ScoreVO;
import com.spring.db.service.IScoreService;

@Controller
@RequestMapping("/score")
public class ScoreController {
	
	
	// 컨트롤러와 서비스 게층 사이의 의존성 자동 주입을 위해 변수 선언.
	// @Autowired는 스프링 컨테이너에 등록되어 있는 빈들 중, 해당 변수 타입에 맞는
	// 객체를 자동으로 변수에 주입해 주는 아노테이션 입니다.
	@Autowired
	private IScoreService service;
	
	/*
	@Autowired
	public ScoreController(IScoreService service) {
		this.service = service;
	}
	
	@Autowired
	public void setService(IScoreService service) {
		this.service = service;
	}
	*/

	// 점수 등록 화면을 열어주는 처리를 하는 메서드
	@GetMapping("/register")
	public String register() {
		System.out.println("/score/register: GET");
		return "/score/write-form";
	}
	
	// 점수 등록 요청을 처리할 메서드
	@PostMapping("/register")
	public String register(ScoreVO vo) {
		System.out.println("/score/register: POST");
		System.out.println("vo: " + vo);
		service.insertScore(vo);
		
		return "score/write-result";
	}
	
	// 점수 전체 조회를 처리하는 요청 메서
	@GetMapping("/list") 
	// url을 파일명으로 활용하기 위해 리턴값을 void로 처리
	public void list(Model model) {
		System.out.println("/score/list: GET");
		List<ScoreVO> list = service.selectAllScores();
		model.addAttribute("sList",list);
	}
}













