package io.cucumber.core.runner;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.core.backend.Backend;
import io.cucumber.core.runtime.BackendSupplier;
import gherkin.pickles.PickleStep;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;

public abstract class TestBackendSupplier implements Backend, BackendSupplier {

    @Override
    public void buildWorld() {

    }

    @Override
    public void disposeWorld() {

    }

    @Override
    public List<String> getSnippet(PickleStep step, String keyword, SnippetType snippetType) {
        return emptyList();
    }

    @Override
    public Collection<? extends Backend> get() {
        return  Collections.singleton(this);
    }
}