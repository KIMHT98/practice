package com.ssafy.board.service;

import java.util.List;

import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dao.BoardDaoImpl;
import com.ssafy.board.model.dto.Board;

public class BoardServiceImpl implements BoardService{

	private static BoardService service = new BoardServiceImpl();
	//의존성 주입
	private BoardDao dao = BoardDaoImpl.getInstance();
	private BoardServiceImpl() {
	}
	public static BoardService getInstance() {
		return service;
	}
	
	@Override
	public List<Board> getList() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public Board getBoard(int id) {
		dao.updateViewCnt(id);
		return dao.selectOne(id);
	}

	@Override
	public void writeBoard(Board board) {
		dao.insertBoard(board);
	}

	@Override
	public void modifyBoard(Board board) {
		dao.updateBoard(board);
	}

	@Override
	public void removeBoard(int id) {
		dao.deleteBoard(id);
	}

}
