package WebMoviecom.example.demo.Service;



import javax.persistence.NoResultException;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import WebMoviecom.example.demo.DTO.UserDTO;
import WebMoviecom.example.demo.Repo.UserRepo;
import WebMoviecom.example.demo.entity.User;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;
	
	public void create(UserDTO userDTO) {
		User user = new User();
		user.setBirth(userDTO.getBirth());
		user.setFullName(userDTO.getFullName());
		user.setPassword(userDTO.getPassword());
		user.setUsername(userDTO.getPassword());
		userRepo.save(user);
	}
	public void update(UserDTO userDTO) {
		
		User user = userRepo.findById(userDTO.getId()).orElseThrow(NoResultException::new);
		user.setFullName(userDTO.getFullName());
		user.setBirth(userDTO.getBirth());
		userRepo.save(user);
	}
	public void updatePassword(UserDTO userDTO) {
		User user = userRepo.findById(userDTO.getId()).orElseThrow(NoResultException::new);
		user.setPassword(userDTO.getPassword());
		userRepo.save(user);
	}
	public void delete(int id) {
		userRepo.deleteById(id);
	}
//	public PageDTO<UserDTO> searchByAge(int x,int size,int page){
//		Pageable pageable = (Pageable) PageRequest.of(page,size);
//		Page<User> pageRS = userRepo.searchByAge(x, pageable);
//		PageDTO<UserDTO> pageDTO = new PageDTO<>();
//		pageDTO.setTotalPages(pageRS.getTotalPages());
//		pageDTO.setTotalElements(pageRS.getTotalElements());
////		List<UserDTO> categoryDTOs = pageRS.get().map(v -> new ModelMapp)
//		List<UserDTO> categoryDTOs = pageRS.get().map(v -> new ModelMapper().map(v, UserDTO.class)).collect(Collectors.toList());
//		pageDTO.setContents(categoryDTOs);
//		return pageDTO;
//	}
	public UserDTO getById(int id) {
		User user = userRepo.findById(id).orElseThrow(NoResultException::new);
		UserDTO users =new UserDTO();
		users.setBirth(user.getBirth());
		users.setFullName(user.getFullName());
		user.setUsername(user.getUsername());
		return users;
	}
	
}
