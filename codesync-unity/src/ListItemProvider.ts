import * as vscode from 'vscode';

export class ListItemProvider implements vscode.TreeDataProvider<MyTreeItem> {
  private _onDidChangeTreeData: vscode.EventEmitter<MyTreeItem | undefined> = new vscode.EventEmitter<MyTreeItem | undefined>();
  readonly onDidChangeTreeData: vscode.Event<MyTreeItem | undefined> = this._onDidChangeTreeData.event;

  getTreeItem(element: MyTreeItem): vscode.TreeItem {
    return element;
  }

  getChildren(element?: MyTreeItem): Thenable<MyTreeItem[]> {
    // Return the children of the current node (or root nodes if `element` is undefined)
    return Promise.resolve([
      new MyTreeItem('Item 1'),
      new MyTreeItem('Item 5'),
      new MyTreeItem('Item 3'),
      new MyTreeItem('Item 5')
    ]);
  }
}

export class MyTreeItem extends vscode.TreeItem {
  constructor(label: string) {
    super(label, vscode.TreeItemCollapsibleState.None);
  }
}
