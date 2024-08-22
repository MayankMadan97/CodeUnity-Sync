// The module 'vscode' contains the VS Code extensibility API
// Import the module and reference it with the alias vscode in your code below
import * as vscode from 'vscode';
import { ListItemProvider } from './ListItemProvider';
import * as fs from 'fs';
import * as path from 'path';

// This method is called when your extension is activated
// Your extension is activated the very first time the command is executed
export function activate(context: vscode.ExtensionContext) {

	// Use the console to output diagnostic information (console.log) and errors (console.error)
	// This line of code will only be executed once when your extension is activated
	console.log('Congratulations, your extension "codesync-unity" is now active!');

	// The command has been defined in the package.json file
	// Now provide the implementation of the command with registerCommand
	// The commandId parameter must match the command field in package.json
	let disposable = vscode.commands.registerCommand('codesync-unity.helloWorld', () => {
		// The code you place here will be executed every time your command is executed
		// Display a message box to the user
		vscode.window.showInformationMessage('Hello World from CodeSync Unity!');
	});
	vscode.window.registerTreeDataProvider('codesync-list', new ListItemProvider());

	const distFolderPath = path.join(context.extensionPath, 'dist');
    
    // Watch for changes in the dist folder
    fs.watch(distFolderPath, (eventType, filename) => {
        if (eventType === 'change' || eventType === 'rename') {
            vscode.commands.executeCommand('workbench.action.reloadWindow');
        }
    });
	context.subscriptions.push(disposable);
}

// This method is called when your extension is deactivated
export function deactivate() { }
