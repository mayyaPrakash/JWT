package com.jwt.jwt.controller;

import com.jwt.jwt.service.JavaInterface;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/profile")
    @Operation(
            summary = "Get User Profile",
            description = "Returns the profile information of the currently logged-in user."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved user profile"),
            @ApiResponse(responseCode = "403", description = "Forbidden - User is not authorized"),
            @ApiResponse(responseCode = "401", description = "Unauthorized - Invalid or missing token")
    })
    public ResponseEntity<String> userProfile() {
        JavaInterface.getName();
        return ResponseEntity.ok("Prakash");
    }

    @GetMapping("/dashboard")
    @Operation(summary = "Get Admin Dashboard", description = "Returns the dashboard for admin users")
    public String adminDashboard() {
        return "Admin Dashboard Data";
    }
}
