package net.arx.helloworldarx.ui.Dashboard

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import net.arx.helloworldarx.R
import net.arx.helloworldarx.databinding.FragmentDashboardBinding
import net.arx.helloworldarx.ui.Dashboard.DashboardFragmentDirections.ActionMoviesDashboardViewToMovieDetailsView
import net.arx.helloworldarx.ui.Dashboard.DashboardFragmentDirections.actionMoviesDashboardViewToMovieDetailsView
import net.arx.helloworldarx.ui.Dashboard.DashboardFragmentDirections.actionMoviesDashboardViewToMoviesCategoryView
import net.arx.helloworldarx.ui.Dashboard.composables.DashboardUI
import net.arx.helloworldarx.ui.base.BaseFragment
import net.arx.helloworldarx.ui.movieDetails.MovieDetailsFragment
import net.arx.helloworldarx.ui.movieDetails.MovieDetailsFragmentArgs
import net.arx.helloworldarx.ui.theme.HelloWorldArxTheme


@AndroidEntryPoint
class DashboardFragment : BaseFragment<FragmentDashboardBinding>() {

    private val viewModel: DashboardViewModel by viewModels()
    override fun getViewBinding(): FragmentDashboardBinding = FragmentDashboardBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //TODO GET movieId from viewmodel and do this on click
        //Comment it out to stay in your screen for now
        val directions = actionMoviesDashboardViewToMovieDetailsView(13282)
        findNavController().navigate(directions)

        showDashboardUI()
    }

    private fun showDashboardUI(){
        with(binding){
            DashboardView.setContent {
                HelloWorldArxTheme {
                    DashboardUI(
                        viewModel
                    )
                }
            }
        }
    }
}