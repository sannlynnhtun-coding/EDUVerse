/**
 * @Author : Kyaw Zaw Htet
 * @Date : 6/4/2024
 * @Time : 7:54 AM
 * @Project_Name : eduverse
 */
package dev.backend.eduverse.service;

import dev.backend.eduverse.dto.AnnouncementDto;
import dev.backend.eduverse.dto.ExamDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExamService {

    ExamDto createExam(ExamDto examDto);

    List<ExamDto> readExamByPagination(int pageNo, int limit) throws IllegalAccessException;

    ExamDto updateExam(ExamDto examDto);

    void deleteExam(Long id);
}
