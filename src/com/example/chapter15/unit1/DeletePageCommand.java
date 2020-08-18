package com.example.chapter15.unit1;

/**
 * 删除界面命令
 */
public class DeletePageCommand extends Command {
  public DeletePageCommand() {
    super(new PageGroup());
  }

  public DeletePageCommand(Group group) {
    super(group);
  }

  @Override
  public void execute() {
    super.group.find();
    super.group.delete();
    super.group.plan();
  }
}
