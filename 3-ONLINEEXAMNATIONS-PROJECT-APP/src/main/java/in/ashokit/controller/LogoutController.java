package in.ashokit.controller;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class LogoutController {
 @PostMapping("/logout")
 public ResponseEntity<Void> logout(HttpServletRequest request, HttpServletResponse response) {
     Authentication auth = SecurityContextHolder.getContext().getAuthentication();
     if (auth != null) {
         new SecurityContextLogoutHandler().logout(request, response, auth);
     }
     return ResponseEntity.ok().build();
 }
}
