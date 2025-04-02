package com.example.demo.Service;

import com.example.demo.Entity.MealPlan;
import com.example.demo.Repository.MealPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MealPlanService {

    @Autowired
    private MealPlanRepository mealPlanRepository;

    public MealPlan createMealPlan(MealPlan mealPlan) {
        return mealPlanRepository.save(mealPlan);
    }

    public List<MealPlan> getAllMealPlans() {
        return mealPlanRepository.findAll();
    }

    public Optional<MealPlan> getMealPlanById(Long id) {
        return mealPlanRepository.findById(id);
    }

    public MealPlan updateMealPlan(Long id, MealPlan mealPlanDetails) {
        MealPlan mealPlan = mealPlanRepository.findById(id).orElseThrow();
        mealPlan.setPlanName(mealPlanDetails.getPlanName());
        mealPlan.setType(mealPlanDetails.getType());
        mealPlan.setDietFood(mealPlanDetails.getDietFood());
        return mealPlanRepository.save(mealPlan);
    }

    public void deleteMealPlan(Long id) {
        mealPlanRepository.deleteById(id);
    }
}
