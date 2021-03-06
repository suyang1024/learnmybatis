package com.monkey1024.bean;

import java.util.List;

public class Employee {

    private int id;

    private String name;

    private String job;

    //表示多的一方，即当前员工的所有下属
    private List<Employee> children;

    private Employee leader;

    public Employee() {
    }

    public Employee(int id, String name, String job, List<Employee> children, Employee leader) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.children = children;
        this.leader = leader;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", children=" + children +
                ", leader=" + leader +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public List<Employee> getChildren() {
        return children;
    }

    public void setChildren(List<Employee> children) {
        this.children = children;
    }

    public Employee getLeader() {
        return leader;
    }

    public void setLeader(Employee leader) {
        this.leader = leader;
    }
}
