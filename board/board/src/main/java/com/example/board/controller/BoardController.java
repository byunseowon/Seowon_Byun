package com.example.board.controller;

import com.example.board.domain.Board;
import com.example.board.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("")
    public List<Board> getAllBoards() {
        return boardService.getAllBoards();
    }

    @GetMapping("/{id}")
    public Board getBoardById(@PathVariable Long id) {
        return boardService.getBoardById(id);
    }

    @PostMapping("")
    public void createBoard(@RequestBody Board board) {
        boardService.createBoard(board);
    }

    @PutMapping("/{id}")
    public void updateBoard(@PathVariable Long id, @RequestParam String password, @RequestBody Board board) {
        boardService.updateBoard(id, password, board);
    }

    @DeleteMapping("/{id}")
    public void deleteBoard(@PathVariable Long id, @RequestParam String password) {
        boardService.deleteBoard(id, password);
    }
}
