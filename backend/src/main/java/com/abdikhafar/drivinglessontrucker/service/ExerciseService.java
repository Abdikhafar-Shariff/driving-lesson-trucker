package com.abdikhafar.drivinglessontrucker.service;

import com.abdikhafar.drivinglessontrucker.dto.request.ExerciseRequestDto;
import com.abdikhafar.drivinglessontrucker.dto.response.ExerciseResponseDto;
import com.abdikhafar.drivinglessontrucker.mapper.ExerciseMapper;
import com.abdikhafar.drivinglessontrucker.model.Exercise;
import com.abdikhafar.drivinglessontrucker.repository.ExerciseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExerciseService {
    private final ExerciseRepository exerciseRepository;
    private final ExerciseMapper exerciseMapper;

    public ExerciseService(ExerciseRepository exerciseRepository, ExerciseMapper exerciseMapper) {
        this.exerciseRepository = exerciseRepository;
        this.exerciseMapper = exerciseMapper;
    }

    public ExerciseResponseDto createExercise(ExerciseRequestDto exerciseRequestDto){
        Exercise exercise = exerciseMapper.toEntity(exerciseRequestDto);
        exercise = exerciseRepository.save(exercise);
        return exerciseMapper.responseDto(exercise);
    }

    public List<ExerciseResponseDto> getAllExercise(){
        List<Exercise> exercises = exerciseRepository.findAll();
        return exerciseMapper.requestDtoList(exercises);

    }
}
