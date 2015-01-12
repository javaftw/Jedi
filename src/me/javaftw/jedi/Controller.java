/**
 * Jedi by Tarun Boddupalli
 *
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Tarun Boddupalli
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package me.javaftw.jedi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private List<ConvertibleFile> inputFiles, outputFiles;

    @FXML
    private Hyperlink link;

    @FXML
    private ListView filesListView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    public void openLink(ActionEvent e) throws Exception {
        Desktop.getDesktop().browse(new URL("http://github.com/javaftw/Jedi").toURI());
    }

    @FXML
    public void addFiles() {
        FileChooser chooser = new FileChooser();
        chooser.showOpenMultipleDialog(null);
    }

    @FXML
    public void clearFiles() {
        if (inputFiles != null) {
            inputFiles.clear();
            outputFiles.clear();
        }
    }

    @FXML
    public void convertFiles() {

    }
}