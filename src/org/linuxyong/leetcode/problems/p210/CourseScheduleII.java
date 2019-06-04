package org.linuxyong.leetcode.problems.p210;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Set<Integer>> preList = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; ++i) {
            preList.add(new HashSet<>());
        }
        for (int i = 0; i < prerequisites.length; ++i) {
            int preCourse = prerequisites[i][1];
            int subCourse = prerequisites[i][0];
            preList.get(subCourse).add(preCourse);
        }

        List<Integer> result = new ArrayList<>();
        Set<Integer> checkSet = new HashSet<>();
        for (int i = 0; i < numCourses; ++i) {
            checkSet.add(i);
        }
        Set<Integer> toRemove = new HashSet<>();
        do {
            toRemove.clear();
            Iterator<Integer> iterator = checkSet.iterator();
            while (iterator.hasNext()) {
                int course = iterator.next();
                Set<Integer> preCourses = preList.get(course);
                if (preCourses == null || preCourses.isEmpty()) {
                    result.add(course);
                    iterator.remove();
                    toRemove.add(course);
                }
            }

            iterator = checkSet.iterator();
            while (iterator.hasNext()) {
                int course = iterator.next();
                Set<Integer> preCourses = preList.get(course);
                preCourses.removeAll(toRemove);
            }
        }while (toRemove.size() > 0);

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
