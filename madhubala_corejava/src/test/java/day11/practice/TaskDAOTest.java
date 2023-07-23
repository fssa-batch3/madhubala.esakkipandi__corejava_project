package day11.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskDAOTest {
	@Test
	void testCreateTask() throws DAOException {
		Task task = new Task("Madhubala","process");
		Assertions.assertTrue(TaskDAO.createTask(task));
	}
	@Test
	void testInvalidCreateTask(){
		try {
			Assertions.assertTrue(TaskDAO.createTask(null));
		} catch (DAOException e) {
			Assertions.assertEquals("Cannot run prepared statement.", e.getMessage());
			e.printStackTrace();
		}
	}
}