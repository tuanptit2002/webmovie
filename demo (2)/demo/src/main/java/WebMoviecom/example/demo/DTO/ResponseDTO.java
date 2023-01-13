package WebMoviecom.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Data
@AllArgsConstructor
@Builder
public class ResponseDTO<T> {
	private int status;
	private String msg;
	@JsonInclude(Include.NON_NULL)
	
	private T data;
	public int getStatus() {
		return status;
	}
	public void setCode(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
