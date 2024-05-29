package in.ashokit.dto;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ResetPwdDto {

	 @GetMapping("/resetpwd")
	    public String showResetPasswordPage() {
	        return "resetpwd";
	 }
	 @PostMapping("/resetpwd")
	    public String resetPassword(@RequestParam String oldPassword,
	                                @RequestParam String newPassword,
	                                @RequestParam String confirmPassword) {
	        if (!verifyOldPassword(oldPassword)) {
	            return "resetpwd" ; // Redirect back to reset password

	        }
	        if (!newPassword.equals(confirmPassword)) {
	            return "resetpwd"; // Redirect back to the reset password page

	        }
	        return "redirect:/success";
	 }

	private boolean verifyOldPassword(String oldPassword) {
        return oldPassword.equals("oldPassword123");

	}
}