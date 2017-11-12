package clean;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;

import java.io.IOException;

public class CreateCleanStructure extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {
        VirtualFile file = DataKeys.VIRTUAL_FILE.getData(event.getDataContext());
        Project project = event.getProject();
        if (file == null || project == null) return;
        VirtualFile folder = file.isDirectory() ? file : file.getParent();

        WriteCommandAction.runWriteCommandAction(project, () -> {
            createData(folder);
            createDomain(folder);
            createPresentation(folder);
        });
    }

    private void createData(VirtualFile folder) {
        try {
            VirtualFile data = folder.createChildDirectory(folder, "data");
            VirtualFile sources = data.createChildDirectory(data, "sources");
            createDataSource(sources, "local");
            createDataSource(sources, "server");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createDataSource(VirtualFile folder, String name) {
        try {
            VirtualFile datasource = folder.createChildDirectory(folder, name);
            datasource.createChildDirectory(datasource, "models");
            datasource.createChildDirectory(datasource, "mappers");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createDomain(VirtualFile folder) {
        try {
            VirtualFile domain = folder.createChildDirectory(folder, "domain");
            domain.createChildDirectory(domain, "models");
            domain.createChildDirectory(domain, "usecase");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createPresentation(VirtualFile folder) {
        try {
            VirtualFile presentation = folder.createChildDirectory(folder, "presentation");
            presentation.createChildDirectory(presentation, "models");
            presentation.createChildDirectory(presentation, "mappers");
            presentation.createChildDirectory(presentation, "features");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
