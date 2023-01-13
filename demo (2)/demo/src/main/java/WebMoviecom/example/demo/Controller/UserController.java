package WebMoviecom.example.demo.Controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import WebMoviecom.example.demo.DTO.PageDTO;
import WebMoviecom.example.demo.DTO.ResponseDTO;
import WebMoviecom.example.demo.DTO.UserDTO;
import WebMoviecom.example.demo.Service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public ResponseDTO<Void> add(@ModelAttribute UserDTO u){
		userService.create(u);
		ResponseDTO<Void> respone = new ResponseDTO<Void>();
		respone.setCode(200);
		return respone;
	}
	@PutMapping("/update")
	public ResponseDTO<Void> update(@ModelAttribute UserDTO u) {
		userService.update(u);
		ResponseDTO<Void> respone = new ResponseDTO<Void>();
		respone.setCode(200);
		return respone;
	}
	@DeleteMapping("/")
	public ResponseDTO<Void> delete(@PathVariable("id")int id) {
		userService.delete(id);
		ResponseDTO<Void> respone = new ResponseDTO<Void>();
		respone.setCode(200);
		return respone;
	}
	@PutMapping("/update/password")
	public ResponseDTO<Void> updatePassword(@ModelAttribute UserDTO u) {
		userService.updatePassword(u);
		ResponseDTO<Void> respone = new ResponseDTO<Void>();
		respone.setCode(200);
		return respone;
	}
	@GetMapping("/{id}")
	public ResponseDTO<UserDTO> get(@PathVariable("id")int id){
		UserDTO user = userService.getById(id);
		ResponseDTO<UserDTO> respone = new ResponseDTO<UserDTO>();
		respone.setCode(200);
		respone.setData(user);
		return respone;
	}
//	@GetMapping("/search-age")
//	public ResponseDTO<PageDTO<UserDTO>> searchAge(@RequestParam(name = "tuoi", required = false) int tuoi,
//			@RequestParam(name = "size", required = false) Integer size,
//			@RequestParam(name = "page", required = false) Integer page, Model model){
//		size = size == null ? 10 : size;
//		page = page == null ? 0 : page;
//		PageDTO<UserDTO> pageRS = userService.searchByAge(tuoi, page, size);
//		
//
//		ResponseDTO<PageDTO<UserDTO>> respone = new ResponseDTO<PageDTO<UserDTO>>();
//		respone.setCode(200);
//		respone.setData(pageRS);
//		return respone;
//		
//	}
	
}
