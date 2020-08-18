package com.example.chapter15.unit1;

/**
 * 添加需求命令
 */
public class AddRequirementCommand extends Command {
  public AddRequirementCommand() {
    super(new RequirementGroup());
  }

  public AddRequirementCommand(Group group) {
    super(group);
  }

  @Override
  public void execute() {
    super.group.find();
    super.group.add();
    super.group.plan();
  }
}