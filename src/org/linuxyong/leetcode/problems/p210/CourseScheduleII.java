package org.linuxyong.leetcode.problems.p210;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> edges = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; ++i) {
            edges.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];
        for (int i = 0; i < prerequisites.length; ++i) {
            int preCourse = prerequisites[i][1];
            int subCourse = prerequisites[i][0];
            edges.get(preCourse).add(subCourse);
            indegree[subCourse]++;
        }

        List<Integer> result = new ArrayList<>();

        Queue<Integer> zeroDegreeQueue = new LinkedList<>();
        for (int i = 0; i < numCourses; ++i) {
            if (indegree[i ] == 0) {
                zeroDegreeQueue.add(i);
            }
        }

        while (!zeroDegreeQueue.isEmpty()) {
            int node = zeroDegreeQueue.remove();
            result.add(node);
            List<Integer> adjacents = edges.get(node);
            for (int adjacent: adjacents) {
                if(--indegree[adjacent] == 0) {
                    zeroDegreeQueue.add(adjacent);
                }
            }
        }

        if (result.size() != numCourses) {
            return new int[]{};
        }
        int[] resArray = new int[numCourses];
        for (int i = 0; i < numCourses; ++i) {
            resArray[i] = result.get(i);
        }
        return resArray;
    }
}
