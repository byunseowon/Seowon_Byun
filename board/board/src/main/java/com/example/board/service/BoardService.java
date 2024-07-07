package com.example.board.service;

import com.example.board.domain.Board;
import com.example.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BoardService {
    private final BoardMapper boardMapper;

    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<Board> getAllBoards() {
        return boardMapper.findAll();
    }

    public Board getBoardById(Long id) {
        return boardMapper.findById(id);
    }

    public void createBoard(Board board) {
        boardMapper.insert(board);
    }

    public void updateBoard(Long id, String password, Board board) {
        // 1. id에 해당하는 게시글을 데이터베이스에서 조회
        Board existingBoard = boardMapper.findById(id);

        // 2. 게시글이 존재하고, 비밀번호가 일치하는지 확인
        if (existingBoard != null && existingBoard.getPassword().equals(password)) {
            // 3. 입력된 board 객체에 id 설정
            board.setId(id);

            // 4. 게시글 업데이트
            boardMapper.update(board);
        }
    }

    public void deleteBoard(Long id, String password) {
        boardMapper.delete(id, password);
    }
}
