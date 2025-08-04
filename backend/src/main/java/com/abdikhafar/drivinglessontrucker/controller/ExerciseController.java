package com.abdikhafar.drivinglessontrucker.controller;

import com.abdikhafar.drivinglessontrucker.dto.request.ExerciseRequestDto;
import com.abdikhafar.drivinglessontrucker.dto.response.ExerciseResponseDto;
import com.abdikhafar.drivinglessontrucker.service.ExerciseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/exercise")
public class ExerciseController {
    private final ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @PostMapping("/addExercise")
    public ResponseEntity<ExerciseResponseDto> creatExercise(@RequestBody ExerciseRequestDto exerciseRequestDto){
        ExerciseResponseDto response = exerciseService.createExercise(exerciseRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }
    @GetMapping("/getAllExercise")
    public ResponseEntity<List<ExerciseResponseDto>> getAllExercise(){
        List<ExerciseResponseDto> exercise = exerciseService.getAllExercise();
        return ResponseEntity.ok(exercise);
    }
}
